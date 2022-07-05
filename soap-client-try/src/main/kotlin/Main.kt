import jakarta.xml.ws.BindingProvider
import sk11.*
import test.*


fun main(args: Array<String>) {
    println("Hello World!")
        //val x=Test1()
    val v=Service().basicHttpBindingIService.getData(12)
    val port = SdmService_Service().getSdmService()
    val prov = port as BindingProvider

    prov.requestContext[BindingProvider.USERNAME_PROPERTY] = "demo\\volgarevael"
    prov.requestContext[BindingProvider.PASSWORD_PROPERTY] = "75p127na"
    var x=port.getActualModelVersion(

        GetActualModelVersionRequest()
    )



//    val service = SdmService()

//    val response = port.someFunction(request)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}