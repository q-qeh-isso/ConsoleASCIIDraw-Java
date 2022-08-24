package picture;

import java.util.Scanner;

public class ConsoleDraw {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		while(true){
			System.out.println("Escolha um desenho :)\n");
			System.out.println( "1. Pássaros \n2. Ursinho \n3. Amor \n4. Banco \n5. Abraço \n6. Balão \n7. Dois Corações \n8. Coração \n0. SAIR");
			System.out.print( "Digite um número e pressione enter:" );
			choice = scanner.nextInt();
			System.out.println();
			/// {write your code here

			switch(choice){
			case 1:
				birds();
				break;
			case 2:
				teddylove();
				break;
			case 3:
				love();
				break;
			case 4:
				sit();
				break;
			case 5:
				hug();
				break;
			case 6:
				balloon();
				break;
			case 7:
				inlove();
				break;
			case 8:
				heart();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
		/// }
	}
	
	public static void heart(){
		System.out.println();
		System.out.println("             ,  xp  u  _                  _  j- _p  _");
		System.out.println("      _  `N_  *p `b_ b `L q          _ j _@ jF jF _p\" _y^");
		System.out.println("      \"*s_ \"*, \"h_ 9_ 0_\"p k &     ,jFjF @ j\"_p\"_p\" _p\"  _*\" ");
		System.out.println("    *u_  \"*,_ 9u_\"q_\"b_0_Np9p0 b  jLd 0 0 J\"jP j@ _M\" _m@\" __* ");
		System.out.println("  __  \"9m__ \"*_ 9u_\"u_0_9_9_0JL0 fd Fj'd d p\"j* a*\"_w@\" _w*\"  __ ");
		System.out.println("   \"^m,_  \"*u_\"9u_\"q_9W\"M\"p0Jk0]NF0jNFgL@jP_#\"w@_a*\"__*^\" __w*\"\" ");
		System.out.println("  u__  \"\"*w__\"9u_\"*u_N_*C4@N0NNNNN##0ZQRpCpCpF_*\"_w*\" _a*^\"  ___ ");
		System.out.println("    \"\"**u___\"^m,_\"*s\"NCNCNDWNNNNNNNNNNEAZEMEm@Lw^__w*\"\"__aw*^\"\"");
		System.out.println("   *ua___ \"\"**w__\"*wE@6PN@0N###########NNW0Z*EL*^\"_am*\"\" ____am");
		System.out.println("       \"\"\"^**wa_IF^*6Z@pNN##############NBDMEZ**\"\"_gw**^\"\"\"");
		System.out.println("      ^^*r*mwwaj_EEZ@qNBN################NNWp49ZEELaam**r**^ ");
		System.out.println("         aaaaaaaaZZZZZ##N#################N#EZZZZLaaaaaas");
		System.out.println("            _aam**r**NNNN################N#EDM*r*mwwag,");
		System.out.println("              amr*^ZZWMQ#N###############NNMpEZ5^**ua");
		System.out.println("               -*\"EZ*MN@NNBN###########N@ZNEZ*6E\"*r");
		System.out.println("                 \"jw*TbN@NN#NN######NNNBWNZNEP*2\"\" ");
		System.out.println("                   -@j*Cp5AWNNNNNNNNNbA@NNC*CP-    ");
		System.out.println("                     \"w\"g\"djF0dNNF#0NF#NC4Ch       ");
		System.out.println("                       ` @jFjN@JNF0JL0`L\"p\"        ");
		System.out.println("                          @jFj^0 Ft 0 L`           ");
		System.out.println("                           ` # # FJF]r\"            ");
		System.out.println("                               F F #               ");
		System.out.println("                                 F                            ");
		System.out.println();
	}
	public static void inlove(){
		System.out.println();
		System.out.println("            -=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-           ");
		System.out.println("                                                           ");
		System.out.println("              __        __        __        __             ");
		System.out.println(" .*.        /~ .~\\    /~  ~\\    /~ .~\\    /~  ~\\           ");
		System.out.println(" ***       '      `\\/'      *  '      `\\/'      *          ");
		System.out.println("  V       (                .*)(               . *)         ");
		System.out.println("/\\|/\\      \\          . *./  \\            . *./          ");
		System.out.println("  |         `\\ .      . .*/'    `\\ .      . .*/'       .*. ");
		System.out.println("  |           `\\ * .*. */' _    _ `\\ * .*. */'         *** ");
		System.out.println("                `\\ * */'  ( `\\/'*)  `\\ * */'          /\\V  ");
		System.out.println("                  `\\/'     \\   */'    `\\/'              |/\\");
		System.out.println("                            `\\/'                        |  ");
		System.out.println("                            LOVES"                          );
		System.out.println();
	}
	
	public static void balloon(){
		System.out.println();
		System.out.println("   _..._  ,s$$$s.");
		System.out.println(" .$$$$$$$s$$ss$$$$,");
		System.out.println(" $$$sss$$$$s$$$$$$$");
		System.out.println(" $$ss$$$$$$$$$$$$$$");
		System.out.println(" '$$$s$$$$$$$$$$$$'");
		System.out.println("  '$$$$$$$$$$$$$$'");
		System.out.println("    S$$$$$$$$$$$'");
		System.out.println("     '$$$$$$$$$'");
		System.out.println("       '$$$$$'");
		System.out.println("        '$$$'");
		System.out.println("          ;");
		System.out.println("         ;");
		System.out.println("         ;");
		System.out.println("         ',");
		System.out.println("          ;");
		System.out.println("         ,'");
		System.out.println("         ;");
		System.out.println("         ',");
		System.out.println("          ',");
		System.out.println("           ;");
		System.out.println("          '");
		System.out.println();
	}
	public static void hug(){
		System.out.println();
		System.out.println("                          ,;;;;;;;,");
		System.out.println("                         ;;;;;;;;;;;,");
		System.out.println("                        ;;;;;'_____;'");
		System.out.println("                        ;;;(/))))|((\\");
		System.out.println("                        _;;((((((|))))");
		System.out.println("                       / |_\\\\\\\\\\\\");
		System.out.println("                  .--~(  \\ ~))))))))))))");
		System.out.println("                 /     \\  `\\-(((((((((((\\\\");
		System.out.println("                 |    | `\\   ) |\\       /|)");
		System.out.println("                  |    |  `. _/  \\_____/ |");
		System.out.println("                   |    , `\\~            /");
		System.out.println("                    |    \\  \\           /");
		System.out.println("                   | `.   `\\|          /");
		System.out.println("                   |   ~-   `\\        /");
		System.out.println("                    \\____~._/~ -_,   (\\");
		System.out.println("                     |-----|\\   \\    ';;");
		System.out.println("                    |      | :;;;'     \\");
		System.out.println("                   |  /    |            |");
		System.out.println("                   |       |            | ");
		System.out.println("                    |      `.           /");
		System.out.println();
	}
	public static void sit(){
		System.out.println();
		System.out.println("                  //////                                                     ");
		System.out.println("                  //////                                    ######           ");
		System.out.println("                 (//////)                                  ########          ");
		System.out.println("... ..  ..  ... . ////// . ... .())((() .. . . . .... . . . ..   . . .... . .");
		System.out.println("             _____|____|_____  ((()(()))                   /   /  /          ");
		System.out.println("            /                \\ (((((((()                     /  /            ");
		System.out.println("           |                  |()(()(())_                                    ");
		System.out.println("           |                  |(((()()() |                                   ");
		System.out.println("           \\                  '\\()))))(  |                                   ");
		System.out.println("            \\                   \\(((((  /                                    ");
		System.out.println("             \\              .    \\___. (                                     ");
		System.out.println("              \\            / \\    |:| ) \\                                    ");
		System.out.println("              |            | |`------'   |                                   ");
		System.out.println("              \\____________/  \\_________/                                    ");
		System.out.println(" ..........................................................................   ");
		System.out.println();
	}
	public static void love(){
		System.out.println();
		System.out.println("hugs&kisses&hugs&kisses&hugs&kisses&hugs&kisses&hugs&kisses&");
		System.out.println("&            hugs&kisses&hugs&kisses&hu         &hugs&kisses");
		System.out.println("s&h        es&hugs&kisses&hugs&kiss                 gs&kisse");
		System.out.println("es&h      sses&hugs&kisses&hugs&k                     s&kiss");
		System.out.println("ses&      isses&hugs&kisses&hugs            &kiss      s&kis");
		System.out.println("sses      kisses&hugs&kisses&hu           ugs&kiss      s&ki");
		System.out.println("isse      &kisses&hugs&kisses&h          &hugs&kiss     gs&k");
		System.out.println("kiss      s&kisses&hugs&kisses&         es&hugs&kis     ugs&");
		System.out.println("&kis      gs&kisses&hugs&kisses        sses&hugs&k      hugs");
		System.out.println("s&ki      ugs&kisses&hugs&kisse       kisses&hugs       &hug");
		System.out.println("gs&k      hugs&kisses&hugs&kiss      s&kisses&hu        s&hu");
		System.out.println("ugs&      &hugs&kisses&hugs&kis     ugs&kisses&         es&h");
		System.out.println("hugs      s&hugs&kisses&hugs& i     hugs&kisse          ses&");
		System.out.println("&hug      es&hugs&kisses&hug  k      hugs&kis           sses");
		System.out.println("s&hu      ses&hugs&kisses&h   &       hugs&             isse");
		System.out.println("es&h      sses&hugs&kisse     s&                       &kiss");
		System.out.println("s                             gs&ki                 hugs&kis");
		System.out.println("s                             ugs&kisse         sses&hugs&ki");
		System.out.println("i             ses&h                                        k");
		System.out.println("k             sses&                                        &");
		System.out.println("&kis      gs&kisses&hug   isses&hugs      s&hugs&kisse     s");
		System.out.println("s&kis      gs&kisses&h   &kisses&hug      es&hugs&kisses   g");
		System.out.println("gs&ki      ugs&kisses&   s&kisses&hu      ses&hugs&kisses  u");
		System.out.println("ugs&ki      ugs&kisse   ugs&kisses&h      sses&hugs&kisses h");
		System.out.println("hugs&k      hugs&kiss   hugs&kisses&      isses&h gs&kisses&");
		System.out.println("&hugs&k      hugs&ki   s&hugs&kisses      kisses  ugs&kisses");
		System.out.println("s&hugs&      &hugs&k   es&hugs&kisse              hugs&kisse");
		System.out.println("es&hugs&      &hugs   sses&hugs&kiss      s&kiss  &hugs&kiss");
		System.out.println("ses&hugs      s&hug   isses&hugs&kis      gs&kiss s&hugs&kis");
		System.out.println("sses&hugs      s&h   &kisses&hugs&ki      ugs&kisses&hugs& i");
		System.out.println("isses&hug      es&   s&kisses&hugs&k      hugs&kisses&hug  k");
		System.out.println("kisses&hug      e   ugs&kisses&hugs&      &hugs&kisses&h   &");
		System.out.println("&kisses&hu          hugs&kisses&hugs      s&hugs&kisse     s");
		System.out.println("s&kisses&hu        s&hugs&kisses                           g");
		System.out.println("gs&kisses&h        es&hugs&kisse                           u");
		System.out.println("ugs&kisses&hugs&kisses&hugs&kisses&hugs&kisses&hugs&kisses&h");
		System.out.println();
	}
	public static void teddylove(){
		System.out.println();
		System.out.println("                      __,,,__                      ");
		System.out.println("              ,-\"\"-,-\"       \"-,-\"\"-,              ");
		System.out.println("             /,-' , .-'-.7.-'-. , '-,\\             ");
		System.out.println("             \\(    /  _     _  \\    )/             ");
		System.out.println("              '-,  { (0)   (0) }  ,-'              ");
		System.out.println("               /    >  .---.  <    \\               ");
		System.out.println("              |/ .-'   \\___/   '-. \\|              ");
		System.out.println("              {, /  ,_       _,  \\ ,}              ");
		System.out.println("              \\ {,    \\     /    ,} /              ");
		System.out.println("               ',\\.    '---'    ./,'               ");
		System.out.println("           _.-\"\"\"\"\"\"-._     _.-\"\"\"\"\"\"-._           ");
		System.out.println("         .'            `._.`            '.         ");
		System.out.println("       _/_               _                \\        ");
		System.out.println("    .'`   `\\            | |                \\       ");
		System.out.println("   /        |           | |                 ;      ");
		System.out.println("   |        /           |_|                 |      ");
		System.out.println("   \\  ;'---'    _    ___  _  _  ___         ;      ");
		System.out.println("    '. ;       | |  /   \\| || ||  _|     _ ;       ");
		System.out.println("      `-\\      | |_ | | || |/ /|  _|   .' `,       ");
		System.out.println("         `\\    |___|\\___/ \\__/ |___|  |     \\      ");
		System.out.println("           \\            _ _           \\     |      ");
		System.out.println("       jgs  `\\         | | |         /`   _/       ");
		System.out.println("  ,-\"\"-.    .'`\\       | | |       /`-,-'` .-\"\"-,  ");
		System.out.println(" /      `\\.'    `\\     \\___/     /`    './`      \\ ");
		System.out.println(";  .--.   \\       '\\           /'       /   .--.  ;");
		System.out.println("| (    \\   |,       '\\       /'        |   /    ) |");
		System.out.println(" \\ ;    }             ;\\   /;         `   {    ; / ");
		System.out.println("  `;\\   \\         _.-'  \\ /  `-._         /   /;`  ");
		System.out.println("    \\ \\__.'   _.-'       Y       `-._    '.__//    ");
		System.out.println("     '.___,.-'                       `-.,___.'     ");
		System.out.println();
	}
	public static void birds(){
		System.out.println();
		System.out.println("                _  _                ");
		System.out.println("               ( \\/ )               ");
		System.out.println("        .---.   \\  /   .-\"-.        ");
		System.out.println("       /   6_6   \\/   / 4 4 \\       ");
		System.out.println("       \\_  (__\\       \\_ v _/       ");
		System.out.println("       //   \\\\        //   \\\\       ");
		System.out.println("      ((     ))      ((     ))      ");
		System.out.println("=======\"\"===\"\"========\"\"===\"\"=======");
		System.out.println();
	}

}
