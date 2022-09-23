import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class MyFrame
        extends Frame
        implements ActionListener {
    private Button b1=new Button("Ok");
    private Button b2=new Button("Limpa");
    private Button b3=new Button("Mostra");
    private Button b4=new Button("Sair");
    private TextField tnome = new TextField();
    private TextField tidade = new TextField();
    private TextField tendereco = new TextField();
    private int valorIdade;
    private String retorno = "Resultado";
    private List<Aluno> Alunos = new ArrayList<Aluno>();  //implements interface list<Aluno>
    MyFrame(){
        //frame
        Frame f = new Frame();
            f.setTitle("TP02 - LP2I4");
            f.setLocation(150,150);
            f.setSize(400,180);
            f.setBackground(Color.LIGHT_GRAY);
            f.setVisible(true);
            f.addWindowListener(new FechaJanela());
            f.setLayout(new BorderLayout());

        //elementos
        Panel p1 = new Panel(new GridLayout(3,2, 10,10));

        Label lnome=new Label("Nome: ");
        p1.add(lnome);
        p1.add(tnome);

        Label lidade=new Label("Idade: ");
        p1.add(lidade);
        p1.add(tidade);

        Label lendereco=new Label("Endereço: ");
        p1.add(lendereco);
        p1.add(tendereco);

        f.add(p1, BorderLayout.NORTH);

        Panel p2 = new Panel(new GridLayout(1,4,1,1));

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        f.add(p2, BorderLayout.SOUTH);

        //eventos
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            Aluno novo = new Aluno();
            novo.setEndereco(tendereco.getText());
            novo.setNome(tnome.getText());
            valorIdade=Integer.parseInt(tidade.getText());
            novo.setIdade(valorIdade);
            UUID uuid = UUID.randomUUID();
            novo.setUUID(uuid);

            Alunos.add(novo);

            JOptionPane.showMessageDialog(null, "Aluno incluído!");

            limpa();
        }

        if (e.getSource() == b2)
        {
            limpa();
        }

        if (e.getSource() == b3)
        {
            //return
            for (Aluno aluno:Alunos) {
                retorno += "\nid: "+ aluno.getUUID() +" Nome: " + aluno.getNome();
            }

            //alert
            JOptionPane.showMessageDialog(this, retorno);
        }

        if (e.getSource() == b4)
        {
            System.exit(0);
        }
    }

    public void limpa(){
        tnome.setText("");
        tidade.setText("");
        tendereco.setText("");
    }
}
