package merhaba011BFS2;

public class DFS {
	public static void dolas�m(node dugum)
	{
		if (dugum == null)
			return;
		System.out.println(dugum.data);
		dolas�m(dugum.left);
		dolas�m(dugum.right);
	}
}
