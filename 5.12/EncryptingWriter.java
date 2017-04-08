import java.io.IOException;
import java.io.Writer;

public class EncryptingWriter extends Writer {

	private Writer writer;
	public EncryptingWriter(Writer writer)
	{
		this.writer = writer;
	}
	
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		CaesarCipher cipher = new CaesarCipher();
		cipher.encrypt(cbuf, off, len);
		writer.write(cbuf,off,len);
		
	}

	@Override
	public void flush() throws IOException {
		writer.flush();
		
	}

	@Override
	public void close() throws IOException {
		writer.close();
	}

}
