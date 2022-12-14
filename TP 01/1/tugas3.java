public class tugas3 {

	public static void main(String [] args) {

        //tugas3 

        /* Dira memiliki banyak permen. Karena Dira anak baik, ia ingin berbagi permen tersebut
        dengan teman-temannya. Jika jumlah permen yang dimiliki Dira adalah N, dan 
        jumlah teman-teman Dira sebanyak T, bantulah Dira menghitung berapa 
        jumlah permen yang didapat tiap orang (Dira dan teman-temannya).
        Hitung juga jumlah sisa permen, karena mungkin saja permen yang ada tidak habis dibagi sama rata.

        jumlah permen = 24 buah
        jumlah teman  = 5 orang

            berapa permen yang di bagi ke teman dira? dan apakah ada sisa permen?

        
        */

		int N = 24;
		int T = 5;
		int permenDira;
		int sisa;
		
		permenDira = N / T;
		sisa = N % T;
		
		System.out.println(
            "jumlah permen ada "+N+", dibagi ke Dira dan "+T+
            " temannya,maka setiap orang mendapatkan "+permenDira+" buah permen dengan sisa permen sebanyak "+sisa+" buah");
	
	}

}