package al.jamil.suvo.insouciant.money;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class DataLoad {
	public void load(){
		balanceLoad();
		addMoneyLoad();
		consumeMoneyLoad();
		givenLoanMoneyLoad();
		takenLoanLoad();
		futureAddLoad();
		futureCostLoad();
		monthLoad();
		
	}
	public void balanceLoad(){
		try{
			File xmldataFile=new File("balance.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			String str;
			str=doc.getElementsByTagName("amount").item(0).getTextContent();
			MainClass.amount=Double.parseDouble(str);
			str=doc.getElementsByTagName("loan").item(0).getTextContent();
			MainClass.loan=Double.parseDouble(str);
			str=doc.getElementsByTagName("donate").item(0).getTextContent();
			MainClass.donate=Double.parseDouble(str);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void addMoneyLoad(){
		try{
			MainClass.addData.clear();
			File xmldataFile=new File("addMoney.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			AddData data;
			NodeList nList=doc.getElementsByTagName("data");
			for (int i=0;i<nList.getLength();i++){
				data=new AddData();
				Node nNode=nList.item(i);
				Element eElement=(Element) nNode;
				String Str=new String();
				Str=eElement.getElementsByTagName("date").item(0).getTextContent();
				data.date=Str;
				Str=eElement.getElementsByTagName("balance").item(0).getTextContent();
				data.amount=Double.parseDouble(Str);
				Str=eElement.getElementsByTagName("source").item(0).getTextContent();
				data.source=Str;
				MainClass.addData.add(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void consumeMoneyLoad(){
		try{
			MainClass.consumeData.clear();
			File xmldataFile=new File("consumeInfo.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			ConsumeData data;
			
			NodeList nList=doc.getElementsByTagName("data");
			for (int i=0;i<nList.getLength();i++){
				data=new ConsumeData();
				Node nNode=nList.item(i);
				Element eElement=(Element) nNode;
				String Str=new String();
				Str=eElement.getElementsByTagName("date").item(0).getTextContent();
				data.date=Str;
				Str=eElement.getElementsByTagName("balance").item(0).getTextContent();
				data.amount=Double.parseDouble(Str);
				Str=eElement.getElementsByTagName("source").item(0).getTextContent();
				data.source=Str;
				MainClass.consumeData.add(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void givenLoanMoneyLoad(){
		try{
			MainClass.givenLoanData.clear();
			File xmldataFile=new File("givenLoan.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			GivenLoanData data;
			
			NodeList nList=doc.getElementsByTagName("data");
			for (int i=0;i<nList.getLength();i++){
				data=new GivenLoanData();
				Node nNode=nList.item(i);
				Element eElement=(Element) nNode;
				String Str=new String();
				Str=eElement.getElementsByTagName("date").item(0).getTextContent();
				data.date=Str;
				Str=eElement.getElementsByTagName("balance").item(0).getTextContent();
				data.amount=Double.parseDouble(Str);
				Str=eElement.getElementsByTagName("source").item(0).getTextContent();
				data.person=Str;
				Str=eElement.getElementsByTagName("status").item(0).getTextContent();
				data.status=Str;
				Str=eElement.getElementsByTagName("cleared").item(0).getTextContent();
				data.cleared=Double.parseDouble(Str);
				MainClass.givenLoanData.add(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void takenLoanLoad(){
		try{
			MainClass.takenLoanData.clear();
			File xmldataFile=new File("takenLoan.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			TakenLoanData data;
			
			NodeList nList=doc.getElementsByTagName("data");
			for (int i=0;i<nList.getLength();i++){
				data=new TakenLoanData();
				Node nNode=nList.item(i);
				Element eElement=(Element) nNode;
				String Str=new String();
				Str=eElement.getElementsByTagName("date").item(0).getTextContent();
				data.date=Str;
				Str=eElement.getElementsByTagName("balance").item(0).getTextContent();
				data.amount=Double.parseDouble(Str);
				Str=eElement.getElementsByTagName("source").item(0).getTextContent();
				data.person=Str;
				Str=eElement.getElementsByTagName("status").item(0).getTextContent();
				data.status=Str;
				Str=eElement.getElementsByTagName("cleared").item(0).getTextContent();
				data.cleared=Double.parseDouble(Str);
				MainClass.takenLoanData.add(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void futureAddLoad(){
		try{
			MainClass.futureAddData.clear();
			File xmldataFile=new File("FutureAdd.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			FutureAddData data;
			
			NodeList nList=doc.getElementsByTagName("data");
			for (int i=0;i<nList.getLength();i++){
				data=new FutureAddData();
				Node nNode=nList.item(i);
				Element eElement=(Element) nNode;
				String Str=new String();
				Str=eElement.getElementsByTagName("date").item(0).getTextContent();
				data.date=Str;
				Str=eElement.getElementsByTagName("balance").item(0).getTextContent();
				data.amount=Double.parseDouble(Str);
				Str=eElement.getElementsByTagName("source").item(0).getTextContent();
				data.source=Str;
				MainClass.futureAddData.add(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void futureCostLoad(){
		try{
			MainClass.futureCostData.clear();
			File xmldataFile=new File("FutureCost.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			FutureCostData data;
			
			NodeList nList=doc.getElementsByTagName("data");
			for (int i=0;i<nList.getLength();i++){
				data=new FutureCostData();
				Node nNode=nList.item(i);
				Element eElement=(Element) nNode;
				String Str=new String();
				Str=eElement.getElementsByTagName("date").item(0).getTextContent();
				data.date=Str;
				Str=eElement.getElementsByTagName("balance").item(0).getTextContent();
				data.amount=Double.parseDouble(Str);
				Str=eElement.getElementsByTagName("source").item(0).getTextContent();
				data.source=Str;
				MainClass.futureCostData.add(data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void monthLoad(){
		try{
			MainClass.months.clear();
			File xmldataFile=new File("months.xml");
			if(!xmldataFile.canRead()){
				System.out.println(xmldataFile.toString()+" not found");
				return;
			}
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder=dbFactory.newDocumentBuilder();
			Document doc=dbuilder.parse(xmldataFile);
			doc.getDocumentElement().normalize();
			NodeList elist=doc.getElementsByTagName("data");
			for (int i=0;i<elist.getLength();i++){
				Node nNode=elist.item(i);
				Element eElement=(Element) nNode;
				String str=eElement.getElementsByTagName("month").item(0).getTextContent();
				MainClass.months.add(str);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
