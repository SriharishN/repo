import java.util.*;
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        Document docs[] = new Document[4];
        int id,pages;
        String title,folder;
        for(int i=0;i<docs.length;i++) {
        	id = in.nextInt();
        	in.nextLine();
        	title = in.nextLine();
        	folder = in.nextLine();
        	pages = in.nextInt();
        	docs[i] = new Document(id,title,folder,pages);
        }
        Document getResult[] = docsWithOddPages(docs);
        for(int i=0;i<getResult.length;i++) {
        	System.out.println(getResult[i].getId()+" "+getResult[i].getTitle()+" "+getResult[i].getFolder()+" "+getResult[i].getPages());
        }
        in.close();
	}
	public static Document[] docsWithOddPages(Document[] docs) {
		int getOddPages=0;
		for(int i=0;i<docs.length;i++) {
			if(docs[i].getPages()%2 != 0) {
				getOddPages++;
			}else {
				docs[i] = null;
			}
		}
		Document oddPages[] = new Document[getOddPages];
		int l=0;
		for(int i=0;i<docs.length;i++) {
			if(docs[i] != null) {
				oddPages[l++] = docs[i]; 
			}
		}
		Arrays.sort(oddPages);
		return oddPages;
	}

}
class Document implements Comparable<Document>
{
	private int id;
	private String title;
	private String folderName;
	private int pages;
	public Document(int id,String title,String folder,int pages) {
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
	public int compareTo(Document ob) {
		return this.id - ob.getId();
	}
}