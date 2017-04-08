public interface Cipher {

	public void encrypt(char[] cbuf, int off, int len);
	public void decrypt(char[] cbuf, int off, int len);
}
