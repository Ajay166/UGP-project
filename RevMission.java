class RevMission{


   public static void main(String []args){


     String str="PlatFormIndependent";
     String rev="";
     int leng=str.length();

     for(int i=leng-1;i>=0;i--){
  
      rev=rev+str.charAt(i);      
      }
     
       System.out.println(rev);
    }
  }