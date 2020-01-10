package bysj;



import javax.swing.JFileChooser;

public class openwindow
{
public String name;
public String path;
public void fangfa(String str)
{
					JFileChooser jFileChooser = new JFileChooser("D:");
					jFileChooser.setDialogTitle(str);
                    int i = jFileChooser.showOpenDialog(null);
                    if(i== jFileChooser.APPROVE_OPTION)
                    { //打开文件
                         path = jFileChooser.getSelectedFile().getAbsolutePath();
                         name = jFileChooser.getSelectedFile().getName();
                        System.out.println("当前文件路径："+path+";\n当前文件名："+name);
                    }
                    else
                    {
                        System.out.println("没有选中文件");
                    }
}
}