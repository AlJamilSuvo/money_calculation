package al.jamil.suvo.insouciant.money;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

public class DataSave extends MainClass{
	public void saving(){
		
	}
	public static boolean balanceSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("balance");
			doc.appendChild(rootElement);
					Element am=doc.createElement("amount");
					am.appendChild(doc.createTextNode(String.valueOf(MainClass.amount)));
					rootElement.appendChild(am);
					Element l=doc.createElement("loan");
					l.appendChild(doc.createTextNode(String.valueOf(MainClass.loan)));
					rootElement.appendChild(l);
					Element d=doc.createElement("donate");
					d.appendChild(doc.createTextNode(String.valueOf(MainClass.donate)));
					rootElement.appendChild(d);
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("balance.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean AddInfoSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("addMoney");
			doc.appendChild(rootElement);
			for (int i=0;i<addData.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element date=doc.createElement("date");
				date.appendChild(doc.createTextNode(addData.get(i).date));
				data.appendChild(date);
				Element balance=doc.createElement("balance");
				balance.appendChild(doc.createTextNode(String.valueOf(addData.get(i).amount)));
				data.appendChild(balance);
				Element source=doc.createElement("source");
				source.appendChild(doc.createTextNode(addData.get(i).source));
				data.appendChild(source);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("addMoney.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean ConsumeInfoSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("ConsumeMoney");
			doc.appendChild(rootElement);
			for (int i=0;i<consumeData.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element date=doc.createElement("date");
				date.appendChild(doc.createTextNode(consumeData.get(i).date));
				data.appendChild(date);
				Element balance=doc.createElement("balance");
				balance.appendChild(doc.createTextNode(String.valueOf(consumeData.get(i).amount)));
				data.appendChild(balance);
				Element source=doc.createElement("source");
				source.appendChild(doc.createTextNode(consumeData.get(i).source));
				data.appendChild(source);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("consumeInfo.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean GivenLoanInfoSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("GivenLoan");
			doc.appendChild(rootElement);
			for (int i=0;i<givenLoanData.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element date=doc.createElement("date");
				date.appendChild(doc.createTextNode(givenLoanData.get(i).date));
				data.appendChild(date);
				Element balance=doc.createElement("balance");
				balance.appendChild(doc.createTextNode(String.valueOf(givenLoanData.get(i).amount)));
				data.appendChild(balance);
				Element source=doc.createElement("source");
				source.appendChild(doc.createTextNode(givenLoanData.get(i).person));
				data.appendChild(source);
				Element status=doc.createElement("status");
				status.appendChild(doc.createTextNode(givenLoanData.get(i).status));
				data.appendChild(status);
				Element clear=doc.createElement("cleared");
				clear.appendChild(doc.createTextNode(String.valueOf(givenLoanData.get(i).cleared)));
				data.appendChild(clear);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("GivenLoan.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean TakenLoanInfoSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("TakenLoan");
			doc.appendChild(rootElement);
			for (int i=0;i<takenLoanData.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element date=doc.createElement("date");
				date.appendChild(doc.createTextNode(takenLoanData.get(i).date));
				data.appendChild(date);
				Element balance=doc.createElement("balance");
				balance.appendChild(doc.createTextNode(String.valueOf(takenLoanData.get(i).amount)));
				data.appendChild(balance);
				Element source=doc.createElement("source");
				source.appendChild(doc.createTextNode(takenLoanData.get(i).person));
				data.appendChild(source);
				Element status=doc.createElement("status");
				status.appendChild(doc.createTextNode(takenLoanData.get(i).status));
				data.appendChild(status);
				Element clear=doc.createElement("cleared");
				clear.appendChild(doc.createTextNode(String.valueOf(takenLoanData.get(i).cleared)));
				data.appendChild(clear);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("TakenLoan.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean FutureAddInfoSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("FutureAdd");
			doc.appendChild(rootElement);
			for (int i=0;i<futureAddData.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element date=doc.createElement("date");
				date.appendChild(doc.createTextNode(futureAddData.get(i).date));
				data.appendChild(date);
				Element balance=doc.createElement("balance");
				balance.appendChild(doc.createTextNode(String.valueOf(futureAddData.get(i).amount)));
				data.appendChild(balance);
				Element source=doc.createElement("source");
				source.appendChild(doc.createTextNode(futureAddData.get(i).source));
				data.appendChild(source);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("FutureAdd.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean FutureCostInfoSave(){
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("FutureCost");
			doc.appendChild(rootElement);
			for (int i=0;i<futureCostData.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element date=doc.createElement("date");
				date.appendChild(doc.createTextNode(futureCostData.get(i).date));
				data.appendChild(date);
				Element balance=doc.createElement("balance");
				balance.appendChild(doc.createTextNode(String.valueOf(futureCostData.get(i).amount)));
				data.appendChild(balance);
				Element source=doc.createElement("source");
				source.appendChild(doc.createTextNode(futureCostData.get(i).source));
				data.appendChild(source);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("FutureCost.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean MonthInfoSave(){
		int k=MainClass.months.size();
	
		for (int i=0;i<k;i++){
			for (int j=0;j<k-i-1;j++){
				String[] str=MainClass.months.get(j).split(" ");
				int c=Integer.parseInt(str[1]);
				String []str2=MainClass.months.get(j+1).split(" ");
				int d=Integer.parseInt(str2[1]);
				if (c<d) continue;
				int a=MainClass.monName.indexOf(str[0]);
				int b=MainClass.monName.indexOf(str2[0]);
				
				if (a>b || c>d){
					
					String s=MainClass.months.get(j);
					MainClass.months.set(j, MainClass.months.get(j+1));
					MainClass.months.set(j+1, s);
				}
			}
		}
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			Element rootElement=doc.createElement("Month");
			doc.appendChild(rootElement);
			for (int i=0;i<months.size();i++){
				Element data=doc.createElement("data");
				rootElement.appendChild(data);
				Element mo=doc.createElement("month");
				mo.appendChild(doc.createTextNode(months.get(i)));
				data.appendChild(mo);
			}
			TransformerFactory transformFactory=TransformerFactory.newInstance();
			Transformer transformer=transformFactory.newTransformer();
			DOMSource source=new DOMSource(doc);
			StreamResult result=new StreamResult("months.xml");
			transformer.transform(source, result);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
