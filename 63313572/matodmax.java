class matodmax{
    
        public static void main(String args[]){
            int data[] ={10,55,96,144,23};
            int maxNumber = max(data); // มีการเรียกใช้ max ตรงนี้
            System.out.println("Max Number = "+maxNumber);       // ผลลัพธ์จะแสดง Max Number = 144
        }
          public static int max(int b[])
          {
              int m=b[0];
              for(int i=0;i<b.length;i++)
              {
                  if(m<b[i])
                  {
                    m=b[i];
                  }
              }
              return m;
          }                     // เขียนเมทอด max ตรงนี้
      
      }