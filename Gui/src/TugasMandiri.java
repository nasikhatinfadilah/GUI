


/**
 *
 * @author nasikhatin
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TugasMandiri extends JFrame implements ActionListener{
    JLabel judul = new JLabel();
    JLabel nim = new JLabel();
    JLabel nama = new JLabel();
    JLabel alamat = new JLabel();
    JLabel jenkel = new JLabel();
    JLabel prodi = new JLabel();
    JLabel jurusan = new JLabel();
    JTextField f_nim = new JTextField();
    JTextField f_nama = new JTextField();
    JRadioButton rd_l, rd_p;
    JTextArea ja_alamat = new JTextArea();
    JScrollPane scroll;
    JComboBox jc_prodi, jc_jurusan;
    JButton simpan = new JButton();
    JComboBox box;
    JRadioButton rd, rd1, rd2;
    ButtonGroup br;
   
    public TugasMandiri(){
        judul.setFont(new Font("times new roman", 1, 22));
        judul.setText("BIODATA MAHASISWA");
        judul.setBounds(170, 20, 250, 20);
        add(judul);
       
        nim.setFont(new Font("times new roman", 1, 12));
        nim.setText("NIM");
        nim.setBounds(40, 60, 90, 25);
        add(nim);
       
        f_nim.setFont(new Font("times new roman", 1, 12));
        f_nim.setBounds(180, 60, 170, 25);
        add(f_nim);
       
        nama.setFont(new Font("times new roman", 1, 12));
        nama.setText("Nama");
        nama.setBounds(40, 100, 90, 25);
        add(nama);
       
        f_nama.setFont(new Font("times new roman", 1, 12));
        f_nama.setBounds(180, 100, 270, 25);
        add(f_nama);
       
        alamat.setFont(new Font("times new roman", 1, 12));
        alamat.setText("Alamat");
        alamat.setBounds(40, 140, 100, 25);
        add(alamat);
       
        ja_alamat.setText("");
        ja_alamat.setBounds(170, 140, 290, 60);
        scroll = new JScrollPane(ja_alamat);
        scroll.setBounds(180, 140, 340, 60);
        add(scroll);
       
        jenkel.setFont(new Font("times new roman", 1, 12));
        jenkel.setText("Jenis Kelamin");
        jenkel.setBounds(40, 210, 140, 25);
        add(jenkel);
       
        rd_l = new JRadioButton("Pria");
        rd_l.setFont(new Font("times new roman", 1, 12));
        rd_l.setBounds(180, 200, 80, 45);
        add(rd_l);
       
        rd_p = new JRadioButton("Wanita");
        rd_p.setFont(new Font("times new roman", 1, 12));
        rd_p.setBounds(280, 200, 80, 45);
        add(rd_p);
       
        prodi.setFont(new Font("times new roman", 1, 12));
        prodi.setText("Program Studi");
        prodi.setBounds(40, 250, 140, 25);
        add(prodi);
       
        String pilih[] = {"Pilih","FTM","FTI","FISIPOL"};
        jc_prodi = new JComboBox(pilih);
        jc_prodi.setFont(new Font("times new roman", 1, 12));
        jc_prodi.setBounds(180, 250, 120, 25);
        add(jc_prodi);
       
        jurusan.setFont(new Font("times new roman", 1, 12));
        jurusan.setText("Jurusan");
        jurusan.setBounds(40, 290, 140, 25);
        add(jurusan);
       
        jc_jurusan = new JComboBox();
        jc_jurusan.setFont(new Font("times new roman", 1, 12));
        jc_jurusan.setBounds(180, 290, 150, 25);
        jc_jurusan.addItem("Pilih");
        jc_jurusan.addItem("Sistem Informasi");
        jc_jurusan.addItem("Teknik Informatika");
        jc_jurusan.addItem("Manajemen Informasi");
        jc_jurusan.addActionListener(this);
        add(jc_jurusan);
       
        simpan.setFont(new Font("times new roman", 1, 14));
        simpan.setText("Simpan");
        simpan.setBounds(40, 340, 140, 30);
        simpan.addActionListener(this);
        add(simpan);
       
       
        /*inisiasi frame*/
        this.setLayout(null);
        this.setSize(600, 430);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       
       
    }
    public static void main(String[] args){
       
        TugasMandiri in = new TugasMandiri();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
