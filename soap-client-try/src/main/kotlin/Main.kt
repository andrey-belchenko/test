import sk11.*


fun main(args: Array<String>) {
    println("Hello World!")
        //val x=Test1()
 val s=Service().basicHttpBindingIService.getData(12)

    val request=GetData().apply {
        value=12
    }












//    val s=c.sdmService.getObjects()
//    val service = SdmService()

//    val response = port.someFunction(request)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}