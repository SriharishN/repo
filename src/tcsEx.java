//import java.util.Arrays;
import java.util.Scanner;

public class tcsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        Documents docs[] = new Documents[4];
	        int id,pages;
	        String title,folder;
	        for(int i=0;i<docs.length;i++) {
	        	id = in.nextInt();
	        	in.nextLine();
	        	title = in.nextLine();
	        	folder = in.nextLine();
	        	pages = in.nextInt();
	        	docs[i] = new Documents(id,title,folder,pages);
	        }
	        Documents getResult[] = combineDocs(docs);
	        for(int i=0;i<getResult.length;i++) {
	        	System.out.println(getResult[i].getId()+"\n"+getResult[i].getTitle()+"\n"+getResult[i].getFolder()+"\n"+getResult[i].getPages());
	        }
	        in.close();
		}
		public static Documents[] combineDocs(Documents[] docs) {
			//Document oddPages[] = new Document[docs.length];
            String title="", folder="";
            int sumOfPages=0;
			int maxId=0;
			for(int i=0;i<docs.length;i++) {
				if(docs[i].getId()> maxId)
					maxId = docs[i].getId();
				   
				title += (i==docs.length-1)?docs[i].getTitle():docs[i].getTitle()+"#";
				folder += (i==docs.length-1)?docs[i].getFolder():docs[i].getFolder()+"@";
				sumOfPages+=docs[i].getPages();
			}
			Documents book[] = {new Documents(maxId+1,title,folder,sumOfPages)};			
			return book;
		}

	}
	class Documents
	{
		private int id;
		private String title;
		private String folderName;
		private int pages;
		public Documents(int id,String title,String folder,int pages) {
			this.id = id;
			this.title = title;
			this.folderName = folder;
			this.pages = pages;
		}
		public int getId() {
			return this.id;
		}
		public String getTitle() {
			return this.title;
		}
		public String getFolder() {
			return this.folderName;
		}
		public int getPages() {
			return this.pages;
		}
	/*	public int compareTo(Document ob) {
			return this.id - ob.getId();
		}*/
	}