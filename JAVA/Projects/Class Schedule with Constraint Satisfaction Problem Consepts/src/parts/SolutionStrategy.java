package parts;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for CSP solver implementations. Solving a CSP means finding an
 * assignment, which is consistent and complete with respect to a CSP. This
 * abstract class provides the central interface method and additionally an
 * implementation of an observer mechanism.
 * 
 * To code a CSP solver, one should extend the SolutionStrategy abstract class. 
 * It essentially defines a solve() method that returns an assignment for a given CSP. 
 * It also provides some util methods to trace step-by-step the solving process, using the CSPStateListener interface
 */
public abstract class SolutionStrategy {
    List<CSPStateListener> listeners = new ArrayList<CSPStateListener>();

    /**
     * Adds a CSP state listener to the solution strategy.
     *
     *  listener a listener which follows the progress of the solution strategy
     *                 step-by-step.
     */
    public void addCSPStateListener(CSPStateListener listener) {
        listeners.add(listener);
    }

    /**
     * Removes a CSP listener from the solution strategy.
     *
     * listener the listener to remove
     */
    public void removeCSPStateListener(CSPStateListener listener) {
        listeners.remove(listener);
    }

    protected void fireStateChanged(CSP csp) {
        for (CSPStateListener listener : listeners)
            listener.stateChanged(csp.copyDomains());
    }

    protected void fireStateChanged(Assignment assignment, CSP csp) {
        for (CSPStateListener listener : listeners)
            listener.stateChanged(assignment.copy(), csp.copyDomains());
    }

    /**
     * Returns a solution to the specified CSP, which specifies values for all
     * the variables such that the constraints are satisfied.
     *
     * csp a CSP to solve
     * @return a solution to the specified CSP, which specifies values for all
     * the variables such that the constraints are satisfied.
     */
    public abstract Assignment solve(CSP csp);
}
