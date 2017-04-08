import java.io.IOException;
import java.io.Reader;

public class DecryptingReader extends Reader {

	private Reader reader;
	public DecryptingReader(Reader reader)
	{
		this.reader = reader;
	}
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		int s = reader.read(cbuf, off, len);
		CaesarCipher cipher = new CaesarCipher();
		cipher.decrypt(cbuf, off, len);
		return s;
	}

	@Override
	public void close() throws IOException {
		reader.close();
		
	}

}
