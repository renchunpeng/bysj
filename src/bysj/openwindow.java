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
                    { //���ļ�
                         path = jFileChooser.getSelectedFile().getAbsolutePath();
                         name = jFileChooser.getSelectedFile().getName();
                        System.out.println("��ǰ�ļ�·����"+path+";\n��ǰ�ļ�����"+name);
                    }
                    else
                    {
                        System.out.println("û��ѡ���ļ�");
                    }
}
}