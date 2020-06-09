

public class Node {

	public final String value; // node un isim de�i�keni
    public double pathCost;    // ba�lang� noktas�ndan o node a gelene kadar olu�an pathcost
	public Edge[] adjacencies; // node un kom�ular� - sonra bu adjacencies leri 2 de�i�kenli (target ve cost) bir s�n�f olarak d���me ba�l�yoruz.
    public Node parent;        // node un atalar�

    public Node(String val){

        value = val;

    }

    public String toString(){
        return value;
    }
}
