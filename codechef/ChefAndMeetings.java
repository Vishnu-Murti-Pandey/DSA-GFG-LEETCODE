package codechef;
import java.io.*;

public class ChefAndMeetings {

	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			
			String chef = br.readLine();
			int time = Integer.parseInt(chef.charAt(0) +""+ chef.charAt(1) +""+ chef.charAt(3) + ""+ chef.charAt(4));
			String mag = chef.charAt(6) +""+ chef.charAt(7);
			
			int actTime = 0;
			
			if(mag.equals("AM")) {
				if(time>=1200 && time<=1259) {
					actTime = time - 1200;
				}
				else {
					actTime = time;
					
				}
			}
			else {
				if(time>=1200 && time<=1259) {
					actTime = time;
				}
				else {
					actTime = time + 1200;
				}
			}
			
			int n = Integer.parseInt(br.readLine());
			
			String ans = "";
			
			for(int i=0; i<n; i++) {
			
				String str = br.readLine();
				
				String mag1 = str.charAt(6) + ""+ str.charAt(7);;
	
			    String mag2 = str.charAt(15) +""+ str.charAt(16);
			    
			    int  time1 = Integer.parseInt(str.charAt(0) +""+ str.charAt(1) +""+ str.charAt(3) + ""+ str.charAt(4));
			    
			    int time2 = Integer.parseInt(str.charAt(9) +""+ str.charAt(10) +""+ str.charAt(12) + ""+ str.charAt(13));
			    
			    int actTime1 = 0;
			    int actTime2 = 0;
			
			    if(mag1.equals("AM")) {
					if(time1>=1200 && time1<=1259) {
						actTime1 = time1 - 1200;
					}
					else {
						actTime1 = time1;
						
					}
				}
				else {
					if(time1>=1200 && time1<=1259) {
						actTime1 = time1;
					}
					else {
						actTime1 = time1 + 1200;
					}
				}
			    
			    if(mag2.equals("AM")) {
					if(time2>=1200 && time2<=1259) {
						actTime2 = time2 - 1200;
					}
					else {
						actTime2 = time2;
						
					}
				}
				else {
					if(time2>=1200 && time2<=1259) {
						actTime2 = time2;
					}
					else {
						actTime2 = time2 + 1200;
					}
				}
			    
			    if(actTime1<=actTime && actTime<=actTime2) {
			    	ans = ans + "1";
			    }
			    else {
			    	ans = ans + "0";
			    }
		    
			}
			System.out.println(ans);
		}
		
	}
}
