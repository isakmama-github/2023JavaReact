package exam16;



import java.io.*;

public class BufferTest {

	public static void main(String[] args) throws Exception {
		String OriginalFilePath1 = 
				BufferTest.class.getResource("bg001.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(OriginalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		String OriginalFilePath2 =
				BufferTest.class.getResource("bg001.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(OriginalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println(nonBufferTime);
		
		long bufferTime = copy(bis, bos);
		System.out.println(bufferTime);
		
		fis.close();
		fos.close();
		fis2.close();
		fos2.close();
		bis.close();
		bos.close();
		
	}
//	static int data = -1;
	private static long copy(InputStream is, OutputStream os) throws IOException {
		long start = System.nanoTime();
		while(true) {
		    int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		return (System.nanoTime() - start);
	}

}
