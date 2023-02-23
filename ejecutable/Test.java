package ejecutable ;

import javax.swing.JOptionPane;

public class Test
 {
  public static void main(String[] args) 
  {
    double x,y ;
    int opcion ;
    x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x: "));
    y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y: "));
    
    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONES:\n\n1. Suma.\n2. Resta\n3. Multiplicacion\n4. División\n5. Potencia\n6. Logaritmo"));
    //procesamineto
    switch(opcion)
    {
        case 1:
            //SUMA
            JOptionPane.showMessageDialog(null, "La suma es: "+  (x+y));
            break;
        case 2:
            //resta
            JOptionPane.showMessageDialog(null, "La resta es: "+  (x-y));
                break;
        case 3:
            //MULTIPLICACION
            JOptionPane.showMessageDialog(null, "La multiplicacion es: "+  (x*y));
                break;
        case 4:
            //DIVISION
            if(y!=0){
            JOptionPane.showMessageDialog(null, "La division es: "+  (x/y));
                break;}
            else{JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
            break;}
        case 5:
            //POTENCIA
            JOptionPane.showMessageDialog(null, "La potencia es "+  Math.pow(x, y));
                break;
        case 6:
            //LOGARITMO
            JOptionPane.showMessageDialog(null, "el logaritmo es "+  Math.log(x));
                break;
    }   
  }  
}