/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import negocio.Utils;

/**
 *
 * @author Rafael-CPD
 */
public class FormCracha {
    
    //imagens
    Image back = null;
    Image img01 = null;
    Image img02 = null;
    Image img03 = null;
    Image img04 = null;
    Image img05 = null;
    Image img06 = null;
    Image img07 = null;
    Image img08 = null;
    Image img09 = null;
    
    //leitor de nomes
    String nome1 = " ";
    String nome2 = " ";
    String nome3 = " ";
    String nome4 = " ";
    String nome5 = " ";
    String nome6 = " ";
    String nome7 = " ";
    String nome8 = " ";
    String nome9 = " ";
        
    URL imageurl = getClass().getResource("/imagens/Back.jpg");
    
    private JFrame form;
    private JButton btnFolder1, btnFolder2, btnFolder3, btnFolder4, btnFolder5, btnFolder6, btnFolder7, btnFolder8, btnFolder9, btnGerar;
    private JLabel lblConfImg1, lblConfImg2, lblConfImg3, lblConfImg4, lblConfImg5, lblConfImg6, lblConfImg7, lblConfImg8, lblConfImg9;
    
    //public String getNome1() {
    //   return this.nome1;
    //}
    
    //fontes 
    Font num = new Font("SansSerif", Font.BOLD, 15);
    File qr1 = new File("c:/null.png");
    File qr2 = new File("c:/null.png");
    File qr3 = new File("c:/null.png");
    File qr4 = new File("c:/null.png");
    File qr5 = new File("c:/null.png");
    File qr6 = new File("c:/null.png");
    File qr7 = new File("c:/null.png");
    File qr8 = new File("c:/null.png");
    File qr9 = new File("c:/null.png");
    
    

    public FormCracha() {
        inicializarComponentes();
    }
    
    private void inicializarComponentes()
    {
        form = new JFrame("Cracha");
        form.setBounds(500, 250, 660, 500);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);
        form.setResizable(false);
        Container painelDeConteudo = form.getContentPane();
        
        lblConfImg1 = new JLabel("QR 1: Ausente");
        lblConfImg1.setBounds(40, 5, 190, 30);
        lblConfImg1.setForeground(Color.RED);
        lblConfImg1.setFont(num);
        painelDeConteudo.add(lblConfImg1);
        
        lblConfImg2 = new JLabel("QR 2: Ausente");
        lblConfImg2.setBounds(40, 50, 190, 30);
        lblConfImg2.setForeground(Color.RED);
        lblConfImg2.setFont(num);
        painelDeConteudo.add(lblConfImg2);
        
        lblConfImg3 = new JLabel("QR 3: Ausente");
        lblConfImg3.setBounds(40, 100, 190, 30);
        lblConfImg3.setForeground(Color.RED);
        lblConfImg3.setFont(num);
        painelDeConteudo.add(lblConfImg3);
        
        lblConfImg4 = new JLabel("QR 4: Ausente");
        lblConfImg4.setBounds(40, 150, 190, 30);
        lblConfImg4.setForeground(Color.RED);
        lblConfImg4.setFont(num);
        painelDeConteudo.add(lblConfImg4);
        
        lblConfImg5 = new JLabel("QR 5: Ausente");
        lblConfImg5.setBounds(40, 200, 190, 30);
        lblConfImg5.setForeground(Color.RED);
        lblConfImg5.setFont(num);
        painelDeConteudo.add(lblConfImg5);
        
        lblConfImg6 = new JLabel("QR 6: Ausente");
        lblConfImg6.setBounds(40, 250, 190, 30);
        lblConfImg6.setForeground(Color.RED);
        lblConfImg6.setFont(num);
        painelDeConteudo.add(lblConfImg6);
        
        lblConfImg7 = new JLabel("QR 7: Ausente");
        lblConfImg7.setBounds(40, 300, 190, 30);
        lblConfImg7.setForeground(Color.RED);
        lblConfImg7.setFont(num);
        painelDeConteudo.add(lblConfImg7);
        
        lblConfImg8 = new JLabel("QR 8: Ausente");
        lblConfImg8.setBounds(40, 350, 190, 30);
        lblConfImg8.setForeground(Color.RED);
        lblConfImg8.setFont(num);
        painelDeConteudo.add(lblConfImg8);
        
        lblConfImg9 = new JLabel("QR 9: Ausente");
        lblConfImg9.setBounds(40, 400, 190, 30);
        lblConfImg9.setForeground(Color.RED);
        lblConfImg9.setFont(num);
        painelDeConteudo.add(lblConfImg9);
        
        btnFolder1 = new JButton("SELECIONAR");
        btnFolder1.setBounds(165, 05, 130, 30);
        btnFolder1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           fc.setAcceptAllFileFilterUsed(false);
           int returnVal = fc.showDialog(btnFolder1, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr1 = fc.getSelectedFile();
            nome1 = qr1.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg1.setForeground(Color.GREEN);
            lblConfImg1.setText("QR 1: " + nome1.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder1);
        
        btnFolder2 = new JButton("SELECIONAR");
        btnFolder2.setBounds(165, 50, 130, 30);
        btnFolder2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder2, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr2 = fc.getSelectedFile();
            nome2 = qr2.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg2.setForeground(Color.GREEN);
            lblConfImg2.setText("QR 2: " + nome2.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder2);
        
        btnFolder3 = new JButton("SELECIONAR");
        btnFolder3.setBounds(165, 100, 130, 30);
        btnFolder3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder3, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr3 = fc.getSelectedFile();
            nome3 = qr3.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg3.setForeground(Color.GREEN);
            lblConfImg3.setText("QR 3: " + nome3.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder3);
        
        btnFolder4 = new JButton("SELECIONAR");
        btnFolder4.setBounds(165, 150, 130, 30);
        btnFolder4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder4, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr4 = fc.getSelectedFile();
            nome4 = qr4.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg4.setForeground(Color.GREEN);
            lblConfImg4.setText("QR 4: " + nome4.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder4);
        
        btnFolder5 = new JButton("SELECIONAR");
        btnFolder5.setBounds(165, 200, 130, 30);
        btnFolder5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder5, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr5 = fc.getSelectedFile();
            nome5 = qr5.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg5.setForeground(Color.GREEN);
            lblConfImg5.setText("QR 5: " + nome5.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder5);
        
        btnFolder6 = new JButton("SELECIONAR");
        btnFolder6.setBounds(165, 250, 130, 30);
        btnFolder6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder6, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr6 = fc.getSelectedFile();
            nome6 = qr6.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg6.setForeground(Color.GREEN);
            lblConfImg6.setText("QR 6: " + nome6.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder6);
        
        btnFolder7 = new JButton("SELECIONAR");
        btnFolder7.setBounds(165, 300, 130, 30);
        btnFolder7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder7, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr7 = fc.getSelectedFile();
            nome7 = qr7.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg7.setForeground(Color.GREEN);
            lblConfImg7.setText("QR 7: " + nome7.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder7);
        
        btnFolder8 = new JButton("SELECIONAR");
        btnFolder8.setBounds(165, 350, 130, 30);
        btnFolder8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder8, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr8 = fc.getSelectedFile();
            nome8 = qr8.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg8.setForeground(Color.GREEN);
            lblConfImg8.setText("QR 8: " + nome8.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder8);
        
        btnFolder9 = new JButton("SELECIONAR");
        btnFolder9.setBounds(165, 400, 130, 30);
        btnFolder9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste");
           final JFileChooser fc = new JFileChooser();
           int returnVal = fc.showDialog(btnFolder9, "Selecione o QR Code");

           if (returnVal == JFileChooser.APPROVE_OPTION) {
            qr9 = fc.getSelectedFile();
            nome9 = qr9.getName().replaceFirst("[.][^.]+$", "");;
            lblConfImg9.setForeground(Color.GREEN);
            lblConfImg9.setText("QR 9: " + nome9.replaceFirst("[.][^.]+$", ""));
           }
        }
        });
        painelDeConteudo.add(btnFolder9);
                
        btnGerar = new JButton("Gerar Arquivo");
        btnGerar.setBounds(450, 400, 130, 30);
        btnGerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           System.out.println("Teste 2");
           
           try {
			back = ImageIO.read(imageurl);
			img01 = ImageIO.read(qr1);
                        img02 = ImageIO.read(qr2);
                        img03 = ImageIO.read(qr3);
                        img04 = ImageIO.read(qr4);
                        img05 = ImageIO.read(qr5);
                        img06 = ImageIO.read(qr6);
                        img07 = ImageIO.read(qr7);
                        img08 = ImageIO.read(qr8);
                        img09 = ImageIO.read(qr9);
                        
		}
		catch (Exception j) {
			// TODO: handle exception
		}
		int widthImg01 = back.getWidth(null);
		int heightImg01 = back.getHeight(null);
		
		int totalwidth = widthImg01;
		int totalHeigh = heightImg01;
		
		BufferedImage bfi = new BufferedImage(totalwidth, totalHeigh, BufferedImage.TYPE_INT_ARGB);
                
                //Ajustes de Imagem
		Graphics g = bfi.getGraphics();

		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// Preenche o plano de fundo da pagina com branco
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, totalwidth,totalHeigh);
                
                
                //
                img01 = img01.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img02 = img02.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img03 = img03.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img04 = img04.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img05 = img05.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img06 = img06.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img07 = img07.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img08 = img08.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                img09 = img09.getScaledInstance(166, 166, Image.SCALE_DEFAULT);
                
                
                //QR code 1
                int x1 , y1 ;
                int x2 , y2 ;
                int x3 , y3 ;
                int x4 , y4 ;
                int x5 , y5 ;
                int x6 , y6 ;
                int x7 , y7 ;
                int x8 , y8 ;
                int x9 , y9 ;
                
                
                //Posição QR codes
                x1 = widthImg01 - 568;
                y1 = heightImg01 - 789;
                
                x2 = widthImg01 - 372;
                y2 = heightImg01 - 789;
                
                x3 = widthImg01 - 184;
                y3 = heightImg01 - 789;
                
                x4 = widthImg01 - 568;
                y4 = heightImg01 - 513;
                
                x5 = widthImg01 - 372;
                y5 = heightImg01 - 513;
                
                x6 = widthImg01 - 184;
                y6 = heightImg01 - 513;
                
                x7 = widthImg01 - 568;
                y7 = heightImg01 - 235;
                
                x8 = widthImg01 - 372;
                y8 = heightImg01 - 235;
                
                x9 = widthImg01 - 184;
                y9 = heightImg01 - 235;
                
                //Desenha os QR Codes
		g.drawImage(back, 0, 0, null);
		g.drawImage(img01, x1, y1, null);
                g.drawImage(img02, x2, y2, null);
                g.drawImage(img03, x3, y3, null);
                g.drawImage(img04, x4, y4, null);
                g.drawImage(img05, x5, y5, null);
                g.drawImage(img06, x6, y6, null);
                g.drawImage(img07, x7, y7, null);
                g.drawImage(img08, x8, y8, null);
                g.drawImage(img09, x9, y9, null);
                
                //Desenha o texto
                g.setFont(new Font("Arial", Font.BOLD, 22));
                //01
                g.drawString(nome1, 140, 260);
                //02
                g.drawString(nome2, 335, 260);
                //03
                g.drawString(nome3, 525, 260);
                //04
                g.drawString(nome4, 140, 535);
                //05
                g.drawString(nome5, 335, 535);
                //06
                g.drawString(nome6, 525, 535);
                //07
                g.drawString(nome7, 140, 810);
                //08
                g.drawString(nome8, 335, 810);
                //09
                g.drawString(nome9, 525, 810);
                
                
                //exibe o resultado final
                JFrame fr = new JFrame("Resultado");
		fr.getContentPane().setLayout(new BorderLayout());
		JLabel jl = new JLabel(new ImageIcon(bfi));
		fr.getContentPane().add(jl,BorderLayout.CENTER);
		fr.pack();
		fr.setVisible(true);
                
                // Gerar o arquivo imagem
                BufferedImage gerado = bfi;
                File outputfile = new File("saved.png");
                try {
                    ImageIO.write(gerado, "png", outputfile);
                } catch (IOException ex) {
                    Logger.getLogger(FormCracha.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        });
        painelDeConteudo.add(btnGerar);
        
        
        
        form.setVisible(true);
    }
    
    public boolean accept(File f) {
    if (f.isDirectory()) {
        return true;
    }

    String extension = Utils.getExtension(f);
    if (extension != null) {
        if (extension.equals(Utils.tiff) ||
            extension.equals(Utils.tif) ||
            extension.equals(Utils.gif) ||
            extension.equals(Utils.jpeg) ||
            extension.equals(Utils.jpg) ||
            extension.equals(Utils.png)) {
                return true;
        } else {
            return false;
        }
    }

    return false;
}
    
}
