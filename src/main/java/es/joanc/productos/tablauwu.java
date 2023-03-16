package es.joanc.productos;

import de.vandermeer.asciitable.AsciiTable;

public class tablauwu {

    public class Montaditos
    {
        public static void main( String[] args ) {
            AsciiTable nuevaTabla = new AsciiTable();
            nuevaTabla.addRule();
            nuevaTabla.addRow("*******","*******","*******","*******","*******","*******","*******");
            nuevaTabla.addRule();
            nuevaTabla.addRow("cod","nombre",null,null,null,"Precio base","Descuento");
            nuevaTabla.addRule();
            nuevaTabla.addRow("1","Holmes Alford",null,null,null,"Sens","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("2","Dillon Mcguire",null,null,null,"Calmar","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("3","Aimee Randall",null,null,null,"Teodoro Schmidt","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("4","Grady Dixon",null,null,null,"Moncton","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("5","KimberleyWalters",null,null,null,"Carahue","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("6","Danielle Kirk",null,null,null,"Plato","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("7","Christopher Cobb",null,null,null,"Filacciano","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("8","Justine Mercado",null,null,null,"Zvenigorod","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("9","Eaton Strickland",null,null,null,"Leffinge","Sens");
            nuevaTabla.addRule();
            nuevaTabla.addRow("10","Dane Griffin",null,null,null,"Rockford","Sens");
            nuevaTabla.addRule();
            System.out.println(nuevaTabla.render(100));
        }

    }

 */
