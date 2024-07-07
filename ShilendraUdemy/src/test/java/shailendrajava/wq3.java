package shailendrajava;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class wq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * on the basis of ascci value
		 */

		String l = "Ujjwal@$$55%";
		String result = "";

		for (int i = 0; i <= l.length() - 1; i++) {

			int x = (char) l.charAt(i);

			if (x >= 67 && x <= 127) {

				result = result + l.charAt(i);

			}

		}
		
		System.out.println(result);

	}

}
