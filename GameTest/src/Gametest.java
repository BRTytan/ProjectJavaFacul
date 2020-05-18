import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class Gametest extends JFrame {
    
    ImageIcon athenaParada = new ImageIcon(getClass().getResource("athenaParada.gif"));
    ImageIcon athenaCorrendo = new ImageIcon(getClass().getResource("athenaCorrendo.gif"));
    ImageIcon cenario1 = new ImageIcon(getClass().getResource("Cenario.gif"));
    
    JLabel lCenario1 = new JLabel(cenario1);
    JLabel lAthenaParada = new JLabel(athenaParada);
    JLabel lAthenaCorrendo = new JLabel(athenaCorrendo);
    
    int posAthenaX = 300;
    int posAthenaY = 300;
    
    public Gametest(){
        editarJanela();
        editarComponentes();
    }
    public void editarComponentes(){
        lCenario1.setBounds(0, 0, 500, 500);
        lAthenaParada.setBounds(posAthenaX, posAthenaY, 163, 213);
    }
    public void editarJanela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(lAthenaParada);
        add(lCenario1);
        
    }
    
    public static void main (String[] args){
        new Gametest();
    }
}
