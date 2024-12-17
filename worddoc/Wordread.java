package worddoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Wordread {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		try {
		XWPFDocument document = new XWPFDocument();
		
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Lenovo\\poidemo.docx"));
		// to read word document
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run =paragraph.createRun();
		run.setText("this is my apache poi document");
		document.write(out);
		out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("document created");
		}

	}


