package al.jamil.suvo.insouciant.money;



import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

public class MainClass{
	public static String password;
	public static Password passwordField;
	public static PasswordChange passwordChange;
	public static AddInfo addInfo;
	public static ListView listView;
	public static MainMenu mainMenu;
	public static QuickInfo quickInfo;
	public static DataLoad dataload;
	public static DataSave datasave;
	public static About about;
	public static double amount;
	public static double loan;
	public static double donate;
	public static List<AddData> addData;
	public static List<ConsumeData> consumeData;
	public static List<GivenLoanData> givenLoanData;
	public static List<TakenLoanData> takenLoanData;
	public static List<FutureAddData> futureAddData;
	public static List<FutureCostData> futureCostData;
	public static List<String> months;
	public static List<String> monName;
	public static final String[] MonthName={"January","February","March","April","May","June","July","August",
		"September","October","November","December"};
	MainClass(){
		addInfo=new AddInfo();
		listView=new ListView();
		mainMenu=new MainMenu();
		quickInfo=new QuickInfo();
		dataload=new DataLoad();
		about=new About();
		passwordField=new Password();
		passwordChange=new PasswordChange();
		amount=0;
		donate=0;
		loan=0;
		addData=new ArrayList<AddData>();
		consumeData=new ArrayList<ConsumeData>();
		givenLoanData=new ArrayList<GivenLoanData>();
		takenLoanData=new ArrayList<TakenLoanData>();
		futureAddData=new ArrayList<FutureAddData>();
		futureCostData=new ArrayList<FutureCostData>();
		months=new ArrayList<String>();
		monName=new ArrayList<String>();
		for (int i=0;i<12;i++){
			monName.add(MonthName[i]);
		}
		try{
			File f=new File("p.secure");
			DataInputStream d=new DataInputStream(new FileInputStream("p.secure"));
			if (f.canRead()){
				password=d.readUTF();
				d.close();
				passwordField.setVisible(true);
				System.out.println(password);
			}
			else{
				passwordChange.setUp(1);
				passwordChange.setVisible(true);
			}
			
		} catch(Exception e){
			passwordChange.setUp(1);
			passwordChange.setVisible(true);
		}
		dataload.load();
		DataSave.MonthInfoSave();
	}
	public static void main(String[] args){
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        } catch (InstantiationException ex) {
          
        } catch (IllegalAccessException ex) {
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
		
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					new MainClass();
				}
			});
		} catch (Exception exc){
			exc.printStackTrace();
		}
	}

}
