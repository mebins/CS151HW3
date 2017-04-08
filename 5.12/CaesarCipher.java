import java.util.Arrays;

public class CaesarCipher implements Cipher {

	@Override
	public void encrypt(char[] cbuf, int off, int len) {
		for(int i = off; i < off+len; i++)
		{
			if(cbuf[i] == ' ')
			{
				continue;
			}
			if(cbuf[i] == 'z')
			{
				cbuf[i]-= 25;
			}
			else
			{
				cbuf[i] += 1;
			}
		
		}
		
	}

	@Override
	public void decrypt(char[] cbuf, int off, int len) {
		for(int i = off; i < off+len; i++)
		{
			if(cbuf[i] == ' ')
			{
				continue;
			}
			if(cbuf[i] == 'a')
			{
				cbuf[i]+= 25;
			}
			else
			{
				cbuf[i] -= 1;
			}
		}
	}

}
