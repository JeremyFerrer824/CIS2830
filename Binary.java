public class Binary{
	public static void main(String[] args){
		int m = 127;
		int d = 0;
		if(m == 0 || m==1){
			d=1;
		}
		else {
			int t = m;
			while (t > 0){
				d++;
				t = t/2;
			}
		}
		for(int n = 0; n <=m; n++){
			String b = "";
			for (int c=d-1; c>=0; c--){
				int v =(n>>c) & 1;
				if(v==1)
				b+="1";
				else
					b+="0";
			}
			System.out.println(n+" "+b);
		}
	}
}