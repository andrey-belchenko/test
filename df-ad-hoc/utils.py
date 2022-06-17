from SPARQLWrapper import SPARQLWrapper, JSON
import pandas as pd
pd.set_option('display.max_colwidth', None)


def execSparql(endpoint, query):
    sparql = SPARQLWrapper(endpoint)
    sparql.setReturnFormat(JSON)
    sparql.setQuery(query)
    return sparql.queryAndConvert()


def dataFrameFromSparqlResult(result, removePref) -> pd.DataFrame:
    tbl = []
    titles = []

    for r in result["results"]["bindings"]:
        row = []
        tbl.append(row)
        i = 1
        for f in r:
            val = r[f]["value"]
            if removePref:
                # частный случай, не универсально
                val = val.split("#")[-1].split("/")[-1].split(".")[-1]
            row.append(val)
            if i > len(titles):
                titles.append(f)
            i += 1
    df = pd.DataFrame(tbl, columns=titles)
    return df

def dataFrameToObjects(df: pd.DataFrame) -> list:
    list = []
    for ind in df.index:
        obj = {}
        for column in df:
            obj[column]=df[column][ind]
            # setattr(obj, column, df[column][ind])
        list.append(obj)
    return list


def sparqlDF(endpoint, query, removePref=False):
    return dataFrameFromSparqlResult(execSparql(endpoint, query), removePref)
