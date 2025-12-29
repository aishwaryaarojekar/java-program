package construtors;

class player{
	int jno,tot_run,tot_wicks;
	String p_name,t_name;
	
	player(){
		jno=10;
		tot_run=2034;
		tot_wicks=50;
		p_name="ABC";
		t_name="KKR";
	}
	
	player(String t_n,String p_n,int jn,int t_r,int t_w){
		t_name=t_n;
		p_name=p_n;
		jno=jn;
		tot_run=t_r;
		tot_wicks=t_w;
	}
	
	void display() {
		System.out.println("team name:"+t_name);
		System.out.println("player name:"+p_name);
		System.out.println("jersey no:"+jno);
		System.out.println("total runs:"+tot_run);
		System.out.println("total wickets:"+tot_wicks);
	}
}

public class PlayersDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default constructors object is created
		player p1=new player();
		
		//here all parameterized constructors object is created
		player p2=new player("GT","Shubman Gill",13,3247,52);
		player p3=new player("RCB","Virat Kholi",18,5313,57);
		player p4=new player("MI","Sai Sudharsan",05,1564,59);
		player p5=new player("RR","Washington Sundar",03,3204,48);
		player p6=new player("CSK","Rashid Khan",98,1034,45);
		player p7=new player("KKR","Kagiso Rabada",04,3538,34);
		player p8=new player("PK","Mohammad Siraj",14,1465,64);
		player p9=new player("LSG","Prasidh Krishna",23,2323,58);
		player p10=new player("RCB","Shahrukh Khan",16,3246,51);
		player p11=new player("MI","hieme",23,1104,34);
		
		p1.display();
		System.out.println("---------");
		
		p2.display();
		System.out.println("---------");
		
		p3.display();
		System.out.println("---------");
		
		p4.display();
		System.out.println("---------");
		
		p5.display();
		System.out.println("---------");
		
		p6.display();
		System.out.println("---------");
		
		p7.display();
		System.out.println("---------");
		
		p8.display();
		System.out.println("---------");
		
		p9.display();
		System.out.println("---------");
		
		p10.display();
		System.out.println("---------");
		
		p11.display();
	}
}

