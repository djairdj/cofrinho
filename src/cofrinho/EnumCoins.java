package cofrinho;

public enum EnumCoins {
  BRL("Real Brasileiro"),
  BTC("Bitcoin"),
  USD("Dólar Americano"),
  EUR("Euro"),
  ALL("Lek Albanês"),
  AED("Dirham dos Emirados"),
  AFN("Afghani do Afeganistão"),
  AMD("Dram Armênio"),
  ANG("Guilder das Antilhas"),
  AOA("Kwanza Angolano"),
  ARS("Peso Argentino"),
  AUD("Dólar Australiano"),
  AZN("Manat Azeri"),
  BAM("Marco Conversível"),
  BBD("Dólar de Barbados"),
  BDT("Taka de Bangladesh"),
  BGN("Lev Búlgaro"),
  BHD("Dinar do Bahrein"),
  BIF("Franco Burundinense"),
  BND("Dólar de Brunei"),
  BOB("Boliviano"),
  BRLT("Real Brasileiro Turismo"),
  BSD("Dólar das Bahamas"),
  BWP("Pula de Botswana"),
  BYN("Rublo Bielorrusso"),
  BZD("Dólar de Belize"),
  CAD("Dólar Canadense"),
  CHF("Franco Suíço"),
  CLP("Peso Chileno"),
  CNY("Yuan Chinês"),
  CRC("Colón Costarriquenho"),
  COP("Peso Colombiano"),
  CNH("Yuan chinês offshore"),
  CUP("Peso Cubano"),
  CVE("Escudo Cabo-Verdiano"),
  CZK("Coroa Checa"),
  DKK("Coroa Dinamarquesa"),
  DOGE("Dogecoin"),
  DJF("Franco do Djubouti"),
  DOP("Peso Dominicano"),
  DZD("Dinar Argelino"),
  EGP("Libra Egípcia"),
  ETB("Birr Etíope"),
  ETH("Ethereum"),
  FJD("Dólar de Fiji"),
  GEL("Lari Georgiano"),
  GHS("Cedi Ganês"),
  GBP("Libra Esterlina"),
  GMD("alasi da Gâmbia"),
  GNF("Franco de Guiné"),
  GTQ("Quetzal Guatemalteco"),
  HDR("Rúpia Indonésia"),
  HKD("Dólar de Hong Kong"),
  HNL("Lempira Hondurenha"),
  HRK("Kuna Croata"),
  HTG("Gourde Haitiano"),
  HUF("Florim Húngaro"),
  IDR("Rúpia Indonésia"),
  ILS("Novo Shekel Israelense"),
  INR("Rúpia Indiana"),
  IQD("Dinar Iraquiano"),
  IRR("Rial Iraniano"),
  ISK("Coroa Islandesa"),
  JMD("Dólar Jamaicano"),
  JOD("Dinar Jordaniano"),
  JPY("Iene Japonês"),
  KES("Shilling Queniano"),
  KGS("Som Quirguistanês"),
  KHR("Riel Cambojano"),
  KMF("Franco Comorense"),
  KRW("Won Sul-Coreano"),
  KWD("Dinar Kuwaitiano"),
  KYD("Dólar das Ilhas Cayman"),
  KZT("Tengue Cazaquistanês"),
  LAK("Kip Laosiano"),
  LBP("Libra Libanesa"),
  LKR("Rúpia de Sri Lanka"),
  LSL("Loti do Lesoto"),
  LYD("Dinar Líbio"),
  LTC("Litecoin"),
  MAD("Dirham Marroquino"),
  MDL("Leu Moldavo"),
  MGA("Ariary Madagascarense"),
  MKD("Denar Macedônio"),
  MMK("Kyat de Mianmar"),
  MNT("Mongolian Tugrik"),
  MOP("Pataca de Macau"),
  MRO("Ouguiya Mauritana"),
  MUR("Rúpia Mauriciana"),
  MVR("Rufiyaa Maldiva"),
  MWK("Kwacha Malauiana"),
  MYR("Ringgit Malaio"),
  MXN("Peso Mexicano"),
  MZN("Metical de Moçambique"),
  NAD("Dólar Namíbio"),
  NGN("Naira Nigeriana"),
  NGNI("Naira Nigeriana"),
  NIO("Córdoba Nicaraguense"),
  NPR("Rúpia Nepalesa"),
  NZD("Dólar Neozelandês"),
  NOK("Coroa Norueguesa"),
  OMR("Rial Omanense"),
  PAB("Balboa Panamenho"),
  PEN("Sol do Peru"),
  PGK("Kina Papua_Nova Guiné"),
  PHP("Peso Filipino"),
  PKR("Rúpia Paquistanesa"),
  PLN("Zlóti Polonês"),
  PYG("Guarani Paraguaio"),
  QAR("Rial Catarense"),
  RON("Leu Romeno"),
  RSD("Dinar Sérvio"),
  RUB("Rublo Russo"),
  RWF("Franco Ruandês"),
  SAR("Riyal Saudita"),
  SCR("Rúpias de Seicheles"),
  SDG("Libra Sudanesa"),
  SDR("DSE"),
  SEK("Coroa Sueca"),
  SGD("Dólar de Cingapura"),
  SOS("Shilling Somaliano"),
  STD("Dobra São Tomé/Príncipe"),
  SVC("Colon de El Salvador"),
  SYP("Libra Síria"),
  SZL("Lilangeni Suazilandês"),
  THB("Baht Tailandês"),
  TJS("Somoni do Tajiquistão"),
  TMT("TMT"),
  TND("Dinar Tunisiano"),
  TRY("Nova Lira Turca"),
  TTD("Dólar de Trinidad"),
  TWD("Dólar Taiuanês"),
  TZS("Shilling Tanzaniano"),
  UAH("Hryvinia Ucraniana"),
  UGX("Shilling Ugandês"),
  UYU("Peso Uruguaio"),
  UZS("Som Uzbequistanês"),
  VEF("Bolívar Venezuelano"),
  VND("Dong Vietnamita"),
  VUV("Vatu de Vanuatu"),
  XAF("Franco CFA Central"),
  XAGG("Prata"),
  XBR("Brent Spot"),
  XCD("Dólar do Caribe Oriental"),
  XOF("Franco CFA Ocidental"),
  XPF("Franco CFP"),
  XRP("XRP"),
  YER("Riyal Iemenita"),
  ZMK("Kwacha Zambiana"),
  ZAR("Rand Sul-Africano"),
  ZWL("Dólar Zimbabuense");
  private final String name;

  EnumCoins(String nome) {
    this.name = nome;
  }

  @Override
  public String toString() {
    return this.name;
  }

  public static String descriptionFromCombinations(EnumCoins... siglas) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0, l = siglas.length; i < l; ++i) sb.append(siglas[i]).append(i < l - 1 ? "/" : "");
    return sb.toString();
  }
}
