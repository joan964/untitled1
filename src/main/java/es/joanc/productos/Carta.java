package es.joanc.productos;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import es.joanc.productos.tiposdeproductos.*;

import java.util.ArrayList;

public class Carta {
    private ArrayList<Producto> pedidos;

    public Carta(){
        pedidos.add(new Montaditos("m1","lechuga,tomate y mayonesa","",1.38f,0));
        pedidos.add(new Montaditos("m2","HUEVO DURO lechuga,tomate y mayonesa","",1.38f,0));
        pedidos.add(new Montaditos("m3","VEGETAL CON QUESO,lechuga,tomate y queso","",1.38f,0));
        pedidos.add(new Montaditos("m4","Buerger,bacon ahumado,cebolla crujiente y allioli","",1.38f,0));
        pedidos.add(new Montaditos("m5","Pollo, bacon ahumado y salsa brava","",1.38f,0));
        pedidos.add(new Montaditos("m6","Pollo kebab, cebolla, pimiento verde y mayonesa","",1.38f,0));
        pedidos.add(new Montaditos("m7","CUATRO QUESOS: Queso ibérico, queso brie, queso de cabra y crema de queso","",1.38f,0));
        pedidos.add(new Montaditos("m8","CAPRESE: Jamón gran reserva, queso mozzarella, tomate y pesto","",1.38f,0));
        pedidos.add(new Montaditos("m9","Pulled pork y guacamole","",1.38f,0));
        pedidos.add(new Montaditos("m10","PULLED PORK y queso brie","",1.38f,0));
        pedidos.add(new Montaditos("m11","FILETE RUSO, cebolla caramelizada y salsa de queso cheddar","",1.38f,0));
        pedidos.add(new Montaditos("m12","SALMÓN AHUMADO y crema de queso","",1.38f,0));
        pedidos.add(new Montaditos("m13","CARNE MECHADA DESHILACHADA y cebolla crujiente","",1.38f,0));
        pedidos.add(new Montaditos("m14","JAMÓN GRAN RESERVA, tomate y aceite de oliva virgen extra","",1.38f,0));
        pedidos.add(new Montaditos("m15","CARRILLERA AL VINO TINTO y queso ibérico","",1.38f,0));
        pedidos.add(new Montaditos("m16","QUESO IBÉRICO, tortilla de patatas y mayonesa","",1.38f,0));
        pedidos.add(new Montaditos("m17","ALBÓNDIGAS y salsa BBQ","",1.38f,0));
        pedidos.add(new Montaditos("m18","Pollo, cebolla caramelizada y mayonesa trufada","",1.38f,0));
        pedidos.add(new Montaditos("m19","CHISTORRA, bacon ahumado y salsa brava","",1.38f,0));
        pedidos.add(new Montaditos("m20","Tortilla de patatas","",1.38f,0));

        //BEBIDAS

        pedidos.add(new Bebidas("b1","Joja-Cola 33cl","",Tamañodebebida.pequeña,false,1.38f,0));
        pedidos.add(new Bebidas("b2","Joja-Cola 1l","",Tamañodebebida.grande,false,2f,25));
        pedidos.add(new Bebidas("b3","Agua","",Tamañodebebida.pequeña,false,1.38f,0));
        pedidos.add(new Bebidas("b4","Fanta Limón","",Tamañodebebida.pequeña,false,1.38f,0));
        pedidos.add(new Bebidas("b5","Fanta Naranja","",Tamañodebebida.pequeña,false,1.38f,0));
        pedidos.add(new Bebidas("b6","Cerveza bote 33cl","",Tamañodebebida.pequeña,false,1.38f,0));
        pedidos.add(new Bebidas("b7","Cerveza caña","",Tamañodebebida.mediana,false,1.38f,0));
        pedidos.add(new Bebidas("b8","Cerveza Jarra","",Tamañodebebida.grande,false,6f,10));
        pedidos.add(new Bebidas("b9","Cerveza Jarra infinita(Promoción)","",Tamañodebebida.grande,true,10f,5));

        //Entrantes

        pedidos.add(new Entrantes("e1","Patatas 4 quesos","",2,1.38f,0));
        pedidos.add(new Entrantes("e2","Bolas de pollo","",1,1.38f,0));
        pedidos.add(new Entrantes("e3","Aceitunas","",1,1.38f,0));
        pedidos.add(new Entrantes("e4","Nachos","",1,1.38f,0));
        pedidos.add(new Entrantes("e5","Ensalada de la casa","",1,1.38f,0));
        pedidos.add(new Entrantes("e6","Bolas de Queso","",1,1.38f,0));
        pedidos.add(new Entrantes("e7","Alitas de pollo ( mini)","",2,2f,0));
        pedidos.add(new Entrantes("e8","Alitas de pollo – (super)","",4,4f,0));
        pedidos.add(new Entrantes("e9","Patatas Fritas","",2,2f,0));
        pedidos.add(new Entrantes("e10","Patatas Fritas (Tamaño Maxi)","",4f,1.38f,0));

        pedidos.add(new Postres("p1","Pastel de Queso","",1,1.38f,Postresalergias.aptoC));
        pedidos.add(new Postres("p2","Bolas de Chocolate","",1,1.38f,Postresalergias.nada));
        pedidos.add(new Postres("p3","Helado de Chocolate","",1,1.38f,Postresalergias.aptoD));
        pedidos.add(new Postres("p4","Helado de Vainilla","",1,1.38f,Postresalergias.aptoD));
        pedidos.add(new Postres("p5","Helado de Limón","",1,1.38f,Postresalergias.aptoDaptoC));
        pedidos.add(new Postres("p6","Helado Fresa","",1,1.38f,Postresalergias.aptoDaptoC));
    }
    public void Mostrarcarta(char id) {
        AsciiTable restaurantecarta = new AsciiTable();
        restaurantecarta.addRule();
        restaurantecarta.addRule();
        restaurantecarta.addRow("*******", "*******", "*******", "*******", "*******", "*******");

        switch (id) {
            case 'm': {
                for (int i = 0; i < pedidos.toArray().length; i++) {
                    if (pedidos.get(i).getCodigo().charAt(0) == 'm') {
                        restaurantecarta.addRule();
                        restaurantecarta.addRow(pedidos.get(i).getCodigo(), pedidos.get(i).getNombre(), String.format("%.2f€", pedidos.get(i).calcularPVP()), pedidos.get(i).getDescuento(), "*").setTextAlignment(TextAlignment.RIGHT).setPaddingLeftRight(1);
                    }
                }
                break;
            }
            case 'b': {
                for (int i = 0; i < pedidos.toArray().length; i++) {
                    if (pedidos.get(i).getCodigo().charAt(0) == 'b') {
                        Bebidas bebidas = (Bebidas) pedidos.get(i);
                        restaurantecarta.addRule();
                        restaurantecarta.addRow(pedidos.get(i).getCodigo(), pedidos.get(i).getNombre(), String.format("%.2f€", pedidos.get(i).calcularPVP()), pedidos.get(i).getDescuento(), "Tamaño: " + bebidas.getTamañodebebidas() + " Relleneble " + bebidas.getRellenable()).setTextAlignment(TextAlignment.RIGHT).setPaddingLeftRight(1);
                    }
                }
                break;
            }
            case 'e': {
                for (int i = 0; i < pedidos.toArray().length; i++) {
                    if (pedidos.get(i).getCodigo().charAt(0) == 'e') {
                        Entrantes entrantes = (Entrantes) pedidos.get(i);
                        restaurantecarta.addRule();
                        restaurantecarta.addRow(pedidos.get(i).getCodigo(), pedidos.get(i).getNombre(), String.format("%.2f€", pedidos.get(i).calcularPVP()), pedidos.get(i).getDescuento(), "Num Raciones: " + entrantes.getNumraciones()).setTextAlignment(TextAlignment.RIGHT).setPaddingLeftRight(1);
                    }
                }
                break;
            }
            case 'p': {
                for (int i = 0; i < pedidos.toArray().length; i++) {
                    if (pedidos.get(i).getCodigo().charAt(0) == 'p') {
                        Postres postres = (Postres) pedidos.get(i);
                        restaurantecarta.addRule();
                        restaurantecarta.addRow(pedidos.get(i).getCodigo(), pedidos.get(i).getNombre(), String.format("%.2f€", pedidos.get(i).calcularPVP()), pedidos.get(i).getDescuento(), "Apto para: " + postres.getAptoPostres()).setTextAlignment(TextAlignment.RIGHT).setPaddingLeftRight(1);
                    }
                }
                break;
            }
        }
    }
}

