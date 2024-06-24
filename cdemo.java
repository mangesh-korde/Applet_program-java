/*
  Q...Design an applet which contains three readio buttons
 which color name Red,Blue,Yellow.After selecting radio Button
 applet background color will be changed..
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class cdemo extends Applet implements ItemListener
{
  Checkbox c1,c2,c3;
  CheckboxGroup cg;
  public void init()
  {
    cg=new CheckboxGroup();
    c1=new Checkbox("red",cg,true);
    c2=new Checkbox("blue",cg,false);
    c3=new Checkbox("yellow",cg,false);
   add(c1);add(c2);add(c3);
   c1.addItemListener(this);
   c2.addItemListener(this);
   c3.addItemListener(this);
  }
 public void itemStateChanged(ItemEvent ie)
 {
   if(c1.getState()==true)
      setBackground(Color.red);
  if(c2.getState()==true)
    setBackground(Color.blue);
  if(c3.getState()==true)
     setBackground(Color.yellow);
 }
} 
/*<applet code="cdemo",width="400",height="300">
  </applet>
 */