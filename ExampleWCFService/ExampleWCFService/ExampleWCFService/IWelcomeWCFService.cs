using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace WelcomeWCFService
{
    [ServiceContract]
    public interface IWelcomeWCFService
    {
        [OperationContract]
        void DoWork();
        [OperationContract]
        [WebGet(UriTemplate = "/Welcome/{name}")]
        string Welcome(string name);
    }
}