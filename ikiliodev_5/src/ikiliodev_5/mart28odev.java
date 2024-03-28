package ikiliodev_5;
import java.util.Iterator;
import java.util.Random;

public class mart28odev {
	
	public static void main(String[] args) {
		
		
		//------------------ODEV1-------------------------------
		/*Random random=new Random();
		
		int[][] dizi=new int[3][3];
		
      for (int i = 0; i <3; i++) {

    	  for (int j = 0; j < 3; j++) {
			dizi[j][i]=random.nextInt(10);
		
		}
		
	}
      
	  
      for (int i = 0; i < dizi.length; i++) {
          for (int j = 0; j < dizi[i].length - 1; j++) {
              for (int k = 0; k < dizi[i].length - j - 1; k++) {
                  if (dizi[i][k] > dizi[i][k + 1]) {
                      
                      int temp = dizi[i][k];
                      dizi[i][k] = dizi[i][k + 1];
                      dizi[i][k + 1] = temp;
                  }
              }
          }
      }
      for (int i = 0; i < dizi.length; i++) {
          for (int j = 0; j < dizi[i].length; j++) {
              System.out.print(dizi[i][j] + " ");
          }
          System.out.println();
       }
       
       
       */   
    //---------------------------------------------------------
    
      //---------------------ODEV2-----------------------------
		Random random = new Random();

        
        int boyut = random.nextInt(5) + 1;
        int[][] cokBoyutluDizi = new int[boyut][boyut];

        
        for (int i = 0; i < cokBoyutluDizi.length; i++) {
            
            cokBoyutluDizi[i][0] = random.nextInt(10); 
            for (int j = 1; j < cokBoyutluDizi[i].length; j++) {
                cokBoyutluDizi[i][j] = random.nextInt(10);
            }
        }
        
        
       
        for (int i = 0; i < cokBoyutluDizi.length; i++) {
            for (int j = 0; j < cokBoyutluDizi[i].length-1; j++)
            {
            	int carp=	cokBoyutluDizi[i][j]*cokBoyutluDizi[i][j+1];
            	int topla=carp+cokBoyutluDizi[i][j];
                System.out.print(topla + " ");
            }
            System.out.println();
        }

	}
}
