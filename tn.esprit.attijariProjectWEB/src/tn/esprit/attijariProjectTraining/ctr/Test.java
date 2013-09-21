package tn.esprit.attijariProjectTraining.ctr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@ManagedBean
@SessionScoped
public class Test {
	private int ficheId;
	private int fiche;

	public int getFiche() {
		return fiche;
	}

	public void setFiche(int fiche) {
		this.fiche = fiche;
	}

	public int getFicheId() {
		return ficheId;
	}

	public void setFicheId(int ficheId) {
		this.ficheId = ficheId;
	}

	private Connection baseConnection() {

		System.out
				.println("-------- MOracle JDBC Connection Testing ------------");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return null;
		}

		System.out.println("Oracle JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "labo", "labo");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return connection;

	}

	public void pdfCompta() {

		Connection connection = baseConnection();
		try {

			// InputStream reporte = jasperCtrl.class.getResourceAsStream(path);
			// JasperPrint print;
			// print = JasperFillManager.fillReport(reporte, map, connection);
			// byte[] bytes = JasperExportManager.exportReportToPdf(print);

			JasperDesign jasperDesign = JRXmlLoader
					.load("C:/rapport/ficheDeLancement.jrxml");
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);

			HashMap map = new HashMap();
			// // evaluation = evaluationItems.get(currentEvaluation);
			// Calendar cal = Calendar.getInstance();
			// cal.set(2013, 6, 6);
			// map.put("NumCompte", "TND1700100011023");
			// // map.put("Date",cal.getTime() );
			// // System.out.println(cal.getTime());

			// Map<String, Object> map = new HashMap<String, Object>();

			// map.put("NumCompte", NumComte);
			// System.out.println(NumComte);
			//
			// map.put("Date", date);
			// System.out.println(date);
			// //
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, map, connection);

			// JasperExportManager.exportReportToPdfFile(jasperPrint,
			// "C:/rapport/moumou4.pdf");
			byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);

			System.out.println("salut");

			HttpServletResponse response = (HttpServletResponse) FacesContext
					.getCurrentInstance().getExternalContext().getResponse();
			System.out.println("4");
			response.setHeader("Expires", "0");
			System.out.println("5");
			response.setHeader("Cache-Control",
					"must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			System.out.println("6");
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.getOutputStream().write(bytes);
			FacesContext.getCurrentInstance().responseComplete();
			response.getOutputStream().flush();
			response.getOutputStream().close();

		} catch (JRException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void pdfComptaa() {

		Connection connection = baseConnection();
		try {

			// InputStream reporte = jasperCtrl.class.getResourceAsStream(path);
			// JasperPrint print;
			// print = JasperFillManager.fillReport(reporte, map, connection);
			// byte[] bytes = JasperExportManager.exportReportToPdf(print);

			JasperDesign jasperDesign = JRXmlLoader
					.load("C:/rapport/report1Tb.jrxml");
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);

			HashMap map = new HashMap();
			// // evaluation = evaluationItems.get(currentEvaluation);
			// Calendar cal = Calendar.getInstance();
			// cal.set(2013, 6, 6);
			// map.put("NumCompte", "TND1700100011023");
			// // map.put("Date",cal.getTime() );
			// // System.out.println(cal.getTime());

			// Map<String, Object> map = new HashMap<String, Object>();

			// map.put("NumCompte", NumComte);
			// System.out.println(NumComte);
			//
			// map.put("Date", date);
			// System.out.println(date);
			// //
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, map, connection);

			// JasperExportManager.exportReportToPdfFile(jasperPrint,
			// "C:/rapport/moumou4.pdf");
			byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);

			System.out.println("salut");

			HttpServletResponse response = (HttpServletResponse) FacesContext
					.getCurrentInstance().getExternalContext().getResponse();
			System.out.println("4");
			response.setHeader("Expires", "0");
			System.out.println("5");
			response.setHeader("Cache-Control",
					"must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			System.out.println("6");
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.getOutputStream().write(bytes);
			FacesContext.getCurrentInstance().responseComplete();
			response.getOutputStream().flush();
			response.getOutputStream().close();

		} catch (JRException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void pdfFiche() {

		Connection connection = baseConnection();
		try {

			// InputStream reporte = jasperCtrl.class.getResourceAsStream(path);
			// JasperPrint print;
			// print = JasperFillManager.fillReport(reporte, map, connection);
			// byte[] bytes = JasperExportManager.exportReportToPdf(print);

			JasperDesign jasperDesign = JRXmlLoader
					.load("C:/rapport/report2Fiche.jrxml");
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);

			Map<String, Object> map = new HashMap<String, Object>();
			// // evaluation = evaluationItems.get(currentEvaluation);
			// Calendar cal = Calendar.getInstance();
			// cal.set(2013, 6, 6);
			// map.put("NumCompte", "TND1700100011023");
			// // map.put("Date",cal.getTime() );
			// // System.out.println(cal.getTime());

			// Map<String, Object> map = new HashMap<String, Object>();

			// map.put("NumCompte", NumComte);
			// System.out.println(NumComte);
			//
			// map.put("Date", date);
			// System.out.println(date);
			// //
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, map, connection);

			// JasperExportManager.exportReportToPdfFile(jasperPrint,
			// "C:/rapport/moumou4.pdf");
			byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);

			System.out.println("salut");

			HttpServletResponse response = (HttpServletResponse) FacesContext
					.getCurrentInstance().getExternalContext().getResponse();
			System.out.println("4");
			response.setHeader("Expires", "0");
			System.out.println("Fiiiiiiiiiche");
			response.setHeader("Cache-Control",
					"must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			System.out.println("6");
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.getOutputStream().write(bytes);
			FacesContext.getCurrentInstance().responseComplete();
			response.getOutputStream().flush();
			response.getOutputStream().close();

		} catch (JRException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void pdfComptaaa() {

		Connection connection = baseConnection();
		try {

			// InputStream reporte = jasperCtrl.class.getResourceAsStream(path);
			// JasperPrint print;
			// print = JasperFillManager.fillReport(reporte, map, connection);
			// byte[] bytes = JasperExportManager.exportReportToPdf(print);

			JasperDesign jasperDesign = JRXmlLoader
					.load("C:/rapport/report2Fiche.jrxml");
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);

			HashMap map = new HashMap();
			// // evaluation = evaluationItems.get(currentEvaluation);
			// Calendar cal = Calendar.getInstance();
			// cal.set(2013, 6, 6);
			// map.put("NumCompte", "TND1700100011023");
			// // map.put("Date",cal.getTime() );
			// // System.out.println(cal.getTime());

			// Map<String, Object> map = new HashMap<String, Object>();

			// map.put("NumCompte", NumComte);
			// System.out.println(NumComte);
			//
			// map.put("Date", date);
			// System.out.println(date);
			// //
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, map, connection);

			// JasperExportManager.exportReportToPdfFile(jasperPrint,
			// "C:/rapport/moumou4.pdf");
			byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);

			System.out.println("salut");

			HttpServletResponse response = (HttpServletResponse) FacesContext
					.getCurrentInstance().getExternalContext().getResponse();
			System.out.println("4");
			response.setHeader("Expires", "0");
			System.out.println("5");
			response.setHeader("Cache-Control",
					"must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			System.out.println("6");
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.getOutputStream().write(bytes);
			FacesContext.getCurrentInstance().responseComplete();
			response.getOutputStream().flush();
			response.getOutputStream().close();

		} catch (JRException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void pdfparam() {

		Connection connection = baseConnection();

		try {

			// InputStream reporte = jasperCtrl.class.getResourceAsStream(path);
			// JasperPrint print;
			// print = JasperFillManager.fillReport(reporte, map, connection);
			// byte[] bytes = JasperExportManager.exportReportToPdf(print);

			JasperDesign jasperDesign = JRXmlLoader
					.load("C:/rapport/report2Fiche.jrxml");
			System.out.println("load");
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);

			Map<String, Object> map = new HashMap<String, Object>();

			map.put("id", ficheId);
			System.out.println(ficheId);
			// System.out.println(NumComte);
			//
			// map.put("Date", date);
			// System.out.println(date);
			// //
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, map, connection);
			System.out.println("print");
			// JasperExportManager.exportReportToPdfFile(jasperPrint,
			// "C:/rapport/moumou4.pdf");
			byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);

			System.out.println("salut");

			HttpServletResponse response = (HttpServletResponse) FacesContext
					.getCurrentInstance().getExternalContext().getResponse();
			System.out.println("4");
			response.setHeader("Expires", "0");
			System.out.println("5");
			response.setHeader("Cache-Control",
					"must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			System.out.println("alors");
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.getOutputStream().write(bytes);
			System.out.println("write");
			FacesContext.getCurrentInstance().responseComplete();
			System.out.println("!!!!!!!!!!!!!!!!!!");
			response.getOutputStream().flush();
			response.getOutputStream().close();
			System.out.println("stop");

		} catch (JRException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
