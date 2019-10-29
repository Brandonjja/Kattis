import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Node {
	int parent;
	int id;
	char letter;
}

// TLE

public class FirstOfHerName {

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String nextLine() throws IOException {
			byte[] buf = new byte[1000000]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}

	}

	static List<Node> ladies = new ArrayList<>();

	static int checkParents(char line[]) {
		int ctr = 0;
		Node n;
		int index = 0;
		for (Node j : ladies) {
			n = j;
			while (index < line.length) {
				if (n.letter == line[index]) {
					++index;
					if (n.id == 1) {
						break;
					}
					n = ladies.get(ladies.size() - n.parent);
				} else {
					break;
				}
			}
			if (index == line.length) {
				++ctr;
			}
			index = 0;
		}
		return ctr;
	}

	public static void main(String args[]) throws IOException {
		//Scanner sc = new Scanner(System.in);
		
		Reader sc = new Reader();

		// file C:\Users\ASUS\Desktop\icpc2019data\icpc2019data\G-firstofhername
		// secret-010_ONE_LETTER__RANDOM.in
		// secret-037_MULTI_EXISTING.in
		
		Node dummy = new Node();
		dummy.id = 0;
		dummy.parent = 0;
		dummy.letter = '\n';

		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		//sc.nextLine();
		ladies.add(dummy);
		for (int i = 1; i <= n; i++) {
			ladies.add(1, new Node());
			ladies.get(1).id = i;
			// char line[] = sc.nextLine().toCharArray();
			//String bob = sc.nextLine();
			String line[] = sc.nextLine().toString().split(" ");
			//System.out.println("\"" + line[1] + "\"");
			String bob = line[1].trim();
			ladies.get(1).letter = line[0].charAt(0);
			ladies.get(1).parent = Integer.parseInt(bob);
		}
		long start = System.currentTimeMillis();
		for (int i = 0; i < k; i++) {
			char line[] = sc.nextLine().toCharArray();
			System.out.println(checkParents(line));
		}

		System.out.println("\nTime to Execute: " + ((double)(System.currentTimeMillis() - start) / 1000) + "s");
		sc.close();
	}
}
