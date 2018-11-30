fun main(args: Array<String>) {
    if(readLine()!!.replace("ch","-").matches("[-|o|k|u]*".toRegex())) println("YES") else println("NO")
}

//正規表現パンチマン　chだけなんかうまく行かなかったからreplaceした 一行で終わったのはきもちよかった