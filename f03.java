public class f03{
  public static void main(String args[]) {

int fk[]={5,10,15,20,55,2,84};
int max=0;
int min=999;
int total=0;
for(int f=0;f<fk.length;f++){
 if(max<fk[f]) max=fk[f];
 if(min>fk[f]) min=fk[f];
total+=fk[f];
}
    System.out.println("max="+max);
    System.out.println("min="+min);
    System.out.println("total="+total);
}
}