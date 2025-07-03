import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame{
    private JPanel factura;
    private JButton calcularButton;
    private JButton regresarButton;
    private JTextField codigo;
    private JTextField producto;
    private JTextField precio;
    private JTextField cantidad;
    private JTextField total1;
    private JTextField subtotal1;

    public Factura(){
        setContentPane(factura);
        setTitle("Factura");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);



        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer codigoIngresado = Integer.parseInt(codigo.getText());
                String productoIngresado = producto.getText();
                Double precioIngresado = Double.parseDouble(precio.getText());
                Integer cantidadIngresada = Integer.parseInt(cantidad.getText());
                Double  subtotal = precioIngresado * cantidadIngresada;

                subtotal.toString();
                subtotal1.setText(subtotal.toString());

                Double total = (subtotal *0.15)+subtotal;
                total1.setText(total.toString());

            }
        });

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });
    }

}
