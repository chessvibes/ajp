import java.awt.*;
     import java.applet.*;
     import java.awt.event.*;
 /* <applet code="Stupanel" width=400 height=400>
    </applet> */
   
    public class Stupanel extends Applet implements    ActionListener,ItemListener
     {
             String s1,s2,s3;
             TextField t3,t4,t5,t6,t7;
             Button tot,avg;
             Checkbox c1,c2,c3,c4,m,f;
             CheckboxGroup cbg;
              Panel p1,p2,p3,p4;

              public void init()
             {
                  s3=" ";
                  tot=new Button("Total");
                  avg=new Button("Average");
                 c1=new Checkbox("MCA",true);
                 c2=new Checkbox("Msc Comp");
                 c3=new Checkbox("MSIT");
                 c4=new Checkbox("MSIS");

                 cbg=new CheckboxGroup();

                 m=new Checkbox("Male",cbg,false);
                 f=new Checkbox("Female",cbg,true);
                 p1=new Panel();
                 p1.setLayout(new GridLayout(2,2));

                 p1.add(new Label("Student Number "));
                 p1.add(new TextField(5));

                 p1.add(new Label("Student Name "));
                 p1.add(new TextField(15));
             


      add(p1);
      p2=new Panel(); p2.setLayout(new GridLayout(1,3));
      p2.add(new Label("Gender"));
      p2.add(m);
      p2.add(f);
      add(p2);  

       p3=new Panel(); p3.setLayout(new GridLayout(1,5));
       p3.add(new Label("Degree"));
       p3.add(c1);   p3.add(c2);     p3.add(c3);      p3.add(c4);

       add(p3);

        p4=new Panel(); p4.setLayout(new GridLayout(6,2));
        p4.add(new Label("Marks in JAVA"));
       t3=new TextField(3);    p4.add(t3);

       p4.add(new Label("Marks in VB .Net"));
       t4=new TextField(3); p4.add(t4);

       p4.add(new Label("Marks In C"));
       t5=new TextField(3); p4.add(t5);    

       p4.add(new Label("Total "));
       t6=new TextField(3); p4.add(t6);    

       p4.add(new Label(" Average"));
       t7=new TextField(3); p4.add(t7);    

        p4.add(tot);   p4.add(avg);

        tot.addActionListener(this);
        avg.addActionListener(this);

        c1.addItemListener(this);
        c2.addItemListener(this);
     


        c3.addItemListener(this);
        c4.addItemListener(this);
        m.addItemListener(this);
        f.addItemListener(this);

       
  add(p4);
      }

 
    public void paint(Graphics g)
      {
         int no,m1,m2,m3,tot;
         float avg=0.0f;
         no=m1=m2=m3=tot=0;
         try
         {
            m1=Integer.parseInt(t3.getText());
            m2=Integer.parseInt(t4.getText());
            m3=Integer.parseInt(t5.getText());
         }
         catch(Exception e)
         {
         }
         tot=m1+m2+m3;
         avg= tot/3;
         s1=String.valueOf(tot);
         s2=String.valueOf(avg);
     }

      public boolean action(Event e,Object o)
      {
        repaint();
        return true;
      }

      public void actionPerformed(ActionEvent e)
      {
         s3=e.getActionCommand();
         if(s3.equals("Total"))
           t6.setText(s1);
         if(s3.equals("Average"))
           t7.setText(s2);
           repaint();
      }
        public void itemStateChanged(ItemEvent e)
      {
         repaint();
       }
 }
