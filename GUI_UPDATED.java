import java.awt.*;
class GUI_UPDATED
{
GUI()
{
Frame f=new Frame();
f.setTitle("Registration Document");
f.setSize(800,800);
f.setVisible(true);
f.setLayout(null);
f.setBackground(Color.decode("#273d48"));
Button b=new Button("SUBMIT");
	b.setBounds(100,600,90,50);
	b.setBackground(Color.decode("#fb9214"));
	b.setForeground(Color.decode("#3a2c23"));
f.add(b);
Label lname=new Label("Enter Name");
	lname.setBounds(40,60,200,50);
	lname.setBackground(Color.decode("#fb9214"));
	lname.setForeground(Color.decode("#3a2c23"));
f.add(lname);
Label laddr=new Label("Enter Mobile/Email Address");
	laddr.setBounds(40,130,200,50);
	laddr.setBackground(Color.decode("#fb9214"));
	laddr.setForeground(Color.decode("#3a2c23"));
f.add(laddr);
TextField tfname=new TextField(100);
	tfname.setBounds(250,60,300,50);
	tfname.setBackground(Color.decode("#f5ffe4"));
f.add(tfname);
TextField tfaddr=new TextField(100);
	tfaddr.setBounds(250,130,300,50);
	tfaddr.setBackground(Color.decode("#f5ffe4"));
f.add(tfaddr);
Label lqual=new Label("Choose your Qualification");
	lqual.setBounds(40,200,200,50);
	lqual.setBackground(Color.decode("#fb9214"));
	lqual.setForeground(Color.decode("#3a2c23"));
f.add(lqual);
Checkbox c1=new Checkbox("12th Pass",false);
	c1.setBounds(250,200,200,50);
	c1.setBackground(Color.decode("#f5ffe4"));
f.add(c1);
Checkbox c2=new Checkbox("Graduate",false);
	c2.setBounds(250,250,200,50);
	c2.setBackground(Color.decode("#f5ffe4"));
f.add(c2);
Checkbox c3=new Checkbox("Diploma",false);
	c3.setBounds(250,300,200,50);
	c3.setBackground(Color.decode("#f5ffe4"));
f.add(c3);
Checkbox c4=new Checkbox("Post Graduate",false);
	c4.setBounds(250,350,200,50);
	c4.setBackground(Color.decode("#f5ffe4"));
f.add(c4);
Label lgen=new Label("Gender");
	lgen.setBounds(40,420,200,50);
	lgen.setBackground(Color.decode("#fb9214"));
	lgen.setForeground(Color.decode("#3a2c23"));
f.add(lgen);
CheckboxGroup cgb=new CheckboxGroup();
Checkbox g1=new Checkbox("Male",cgb,false);
	g1.setBounds(250,420,200,50);
	g1.setBackground(Color.decode("#f5ffe4"));
f.add(g1);
Checkbox g2=new Checkbox("Female",cgb,false);
	g2.setBounds(250,470,200,50);
	g2.setBackground(Color.decode("#f5ffe4"));
f.add(g2);
Checkbox g3=new Checkbox("Others",cgb,false);
	g3.setBounds(250,520,200,50);
	g3.setBackground(Color.decode("#f5ffe4"));
f.add(g3);
}
	public static void main(String[] args)
	{	
		GUI g=new GUI();
	}

}