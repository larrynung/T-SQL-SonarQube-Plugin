package com.asadali.codeanalyzer.tsql.keywords;

import java.util.HashSet;
import java.util.Set;

public class TSQLFutureKeywords {
	
	private static Set<String> futureKeywordsSet = new HashSet<String>(273);
	
	static {
	
		futureKeywordsSet.add("ABSOLUTE");
		futureKeywordsSet.add("ACTION");
		futureKeywordsSet.add("ADMIN");
		futureKeywordsSet.add("AFTER");
		futureKeywordsSet.add("AGGREGATE");
		futureKeywordsSet.add("ALIAS");
		futureKeywordsSet.add("ALLOCATE");
		futureKeywordsSet.add("ARE");
		futureKeywordsSet.add("ARRAY");
		futureKeywordsSet.add("ASENSITIVE");
		futureKeywordsSet.add("ASSERTION");
		futureKeywordsSet.add("ASYMMETRIC");
		futureKeywordsSet.add("AT");
		futureKeywordsSet.add("ATOMIC");
		futureKeywordsSet.add("BEFORE");
		futureKeywordsSet.add("BINARY");
		futureKeywordsSet.add("BIT");
		futureKeywordsSet.add("BLOB");
		futureKeywordsSet.add("BOOLEAN");
		futureKeywordsSet.add("BOTH");
		futureKeywordsSet.add("BREADTH");
		futureKeywordsSet.add("CALL");
		futureKeywordsSet.add("CALLED");
		futureKeywordsSet.add("CARDINALITY");
		futureKeywordsSet.add("CASCADED");
		futureKeywordsSet.add("CAST");
		futureKeywordsSet.add("CATALOG");
		futureKeywordsSet.add("CHAR");
		futureKeywordsSet.add("CHARACTER");
		futureKeywordsSet.add("CLASS");
		futureKeywordsSet.add("CLOB");
		futureKeywordsSet.add("COLLATION");
		futureKeywordsSet.add("COLLECT");
		futureKeywordsSet.add("COMPLETION");
		futureKeywordsSet.add("CONDITION");
		futureKeywordsSet.add("CONNECT");
		futureKeywordsSet.add("CONNECTION");
		futureKeywordsSet.add("CONSTRAINTS");
		futureKeywordsSet.add("CONSTRUCTOR");
		futureKeywordsSet.add("CORR");
		futureKeywordsSet.add("CORRESPONDING");
		futureKeywordsSet.add("COVAR_POP");
		futureKeywordsSet.add("COVAR_SAMP");
		futureKeywordsSet.add("CUBE");
		futureKeywordsSet.add("CUME_DIST");
		futureKeywordsSet.add("CURRENT_CATALOG");
		futureKeywordsSet.add("CURRENT_DEFAULT_TRANSFORM_GROUP");
		futureKeywordsSet.add("CURRENT_PATH");
		futureKeywordsSet.add("CURRENT_ROLE");
		futureKeywordsSet.add("CURRENT_SCHEMA");
		futureKeywordsSet.add("CURRENT_TRANSFORM_GROUP_FOR_TYPE");
		futureKeywordsSet.add("CYCLE");
		futureKeywordsSet.add("DATA");
		futureKeywordsSet.add("DATE");
		futureKeywordsSet.add("DAY");
		futureKeywordsSet.add("DEC");
		futureKeywordsSet.add("DECIMAL");
		futureKeywordsSet.add("DEFERRABLE");
		futureKeywordsSet.add("DEFERRED");
		futureKeywordsSet.add("DEPTH");
		futureKeywordsSet.add("DEREF");
		futureKeywordsSet.add("DESCRIBE");
		futureKeywordsSet.add("DESCRIPTOR");
		futureKeywordsSet.add("DESTROY");
		futureKeywordsSet.add("DESTRUCTOR");
		futureKeywordsSet.add("DETERMINISTIC");
		futureKeywordsSet.add("DICTIONARY");
		futureKeywordsSet.add("DIAGNOSTICS");
		futureKeywordsSet.add("DISCONNECT");
		futureKeywordsSet.add("DOMAIN");
		futureKeywordsSet.add("DYNAMIC");
		futureKeywordsSet.add("EACH");
		futureKeywordsSet.add("ELEMENT");
		futureKeywordsSet.add("END-EXEC");
		futureKeywordsSet.add("EQUALS");
		futureKeywordsSet.add("EVERY");
		futureKeywordsSet.add("EXCEPTION");
		futureKeywordsSet.add("FALSE");
		futureKeywordsSet.add("FILTER");
		futureKeywordsSet.add("FIRST");
		futureKeywordsSet.add("FLOAT");
		futureKeywordsSet.add("FOUND");
		futureKeywordsSet.add("FREE");
		futureKeywordsSet.add("FUSION");
		futureKeywordsSet.add("GENERAL");
		futureKeywordsSet.add("GET");
		futureKeywordsSet.add("GLOBAL");
		futureKeywordsSet.add("GO");
		futureKeywordsSet.add("GROUPING");
		futureKeywordsSet.add("HOLD");
		futureKeywordsSet.add("FULLTEXTTABLE");
		
		futureKeywordsSet.add("HOST");
		futureKeywordsSet.add("HOUR");
		futureKeywordsSet.add("IGNORE");
		futureKeywordsSet.add("IMMEDIATE");
		futureKeywordsSet.add("INDICATOR");
		futureKeywordsSet.add("INITIALIZE");
		futureKeywordsSet.add("INITIALLY");
		futureKeywordsSet.add("INOUT");
		futureKeywordsSet.add("INPUT");
		futureKeywordsSet.add("INT");
		futureKeywordsSet.add("INTEGER");
		futureKeywordsSet.add("INTERSECTION");
		futureKeywordsSet.add("INTERVAL");
		futureKeywordsSet.add("ISOLATION");
		futureKeywordsSet.add("ITERATE");
		futureKeywordsSet.add("LANGUAGE");
		futureKeywordsSet.add("LARGE");
		futureKeywordsSet.add("LAST");
		futureKeywordsSet.add("LATERAL");
		futureKeywordsSet.add("LEADING");
		futureKeywordsSet.add("LESS");
		futureKeywordsSet.add("LEVEL");
		futureKeywordsSet.add("LIKE_REGEX");
		futureKeywordsSet.add("LIMIT");
		futureKeywordsSet.add("LN");
		futureKeywordsSet.add("LOCAL");
		futureKeywordsSet.add("LOCALTIME");
		futureKeywordsSet.add("LOCALTIMESTAMP");
		futureKeywordsSet.add("LOCATOR");
		futureKeywordsSet.add("MAP");
		futureKeywordsSet.add("MATCH");
		futureKeywordsSet.add("MEMBER");
		futureKeywordsSet.add("METHOD");
		futureKeywordsSet.add("MINUTE");
		futureKeywordsSet.add("MOD");
		futureKeywordsSet.add("MODIFIES");
		futureKeywordsSet.add("MODIFY");
		futureKeywordsSet.add("MODULE");
		futureKeywordsSet.add("MONTH");
		futureKeywordsSet.add("MULTISET");
		futureKeywordsSet.add("NAMES");
		futureKeywordsSet.add("NATURAL");
		futureKeywordsSet.add("NCHAR");
		futureKeywordsSet.add("NCLOB");
		futureKeywordsSet.add("NEW");
		futureKeywordsSet.add("NEXT");
		futureKeywordsSet.add("NO");
		futureKeywordsSet.add("NONE");
		futureKeywordsSet.add("NORMALIZE");
		futureKeywordsSet.add("NUMERIC");
		futureKeywordsSet.add("OBJECT");
		futureKeywordsSet.add("OCCURRENCES_REGEX");
		futureKeywordsSet.add("OLD");
		futureKeywordsSet.add("ONLY");
		futureKeywordsSet.add("OPERATION");
		futureKeywordsSet.add("ORDINALITY");
		futureKeywordsSet.add("OUT");
		futureKeywordsSet.add("OVERLAY");
		futureKeywordsSet.add("OUTPUT");
		futureKeywordsSet.add("PAD");
		futureKeywordsSet.add("PARAMETER");
		futureKeywordsSet.add("PARAMETERS");
		futureKeywordsSet.add("PARTIAL");
		futureKeywordsSet.add("PARTITION");
		futureKeywordsSet.add("PATH");
		futureKeywordsSet.add("POSTFIX");
		futureKeywordsSet.add("PREFIX");
		futureKeywordsSet.add("PREORDER");
		futureKeywordsSet.add("PREPARE");
		futureKeywordsSet.add("PERCENT_RANK");
		futureKeywordsSet.add("PERCENTILE_CONT");
		futureKeywordsSet.add("PERCENTILE_DISC");
		futureKeywordsSet.add("POSITION_REGEX");
		futureKeywordsSet.add("PRESERVE");
		futureKeywordsSet.add("PRIOR");
		futureKeywordsSet.add("PRIVILEGES");
		futureKeywordsSet.add("RANGE");
		futureKeywordsSet.add("READS");
		futureKeywordsSet.add("REAL");
		futureKeywordsSet.add("RECURSIVE");
		futureKeywordsSet.add("REF");
		futureKeywordsSet.add("REFERENCING");
		futureKeywordsSet.add("REGR_AVGX");
		futureKeywordsSet.add("REGR_AVGY");
		futureKeywordsSet.add("REGR_COUNT");
		futureKeywordsSet.add("REGR_INTERCEPT");
		futureKeywordsSet.add("REGR_R2");
		futureKeywordsSet.add("REGR_SLOPE");
		futureKeywordsSet.add("REGR_SXX");
		futureKeywordsSet.add("REGR_SXY");
		futureKeywordsSet.add("REGR_SYY");
		
		futureKeywordsSet.add("RELATIVE");
		futureKeywordsSet.add("RELEASE");
		futureKeywordsSet.add("RESULT");
		futureKeywordsSet.add("RETURNS");
		futureKeywordsSet.add("ROLE");
		futureKeywordsSet.add("ROLLUP");
		futureKeywordsSet.add("ROUTINE");
		futureKeywordsSet.add("ROW");
		futureKeywordsSet.add("ROWS");
		futureKeywordsSet.add("SAVEPOINT");
		futureKeywordsSet.add("SCROLL");
		futureKeywordsSet.add("SCOPE");
		futureKeywordsSet.add("SEARCH");
		futureKeywordsSet.add("SECOND");
		futureKeywordsSet.add("SECTION");
		futureKeywordsSet.add("SENSITIVE");
		futureKeywordsSet.add("SEQUENCE");
		futureKeywordsSet.add("SESSION");
		futureKeywordsSet.add("SETS");
		futureKeywordsSet.add("SIMILAR");
		futureKeywordsSet.add("SIZE");
		futureKeywordsSet.add("SMALLINT");
		futureKeywordsSet.add("SPACE");
		futureKeywordsSet.add("SPECIFIC");
		futureKeywordsSet.add("SPECIFICTYPE");
		futureKeywordsSet.add("SQL");
		futureKeywordsSet.add("SQLEXCEPTION");
		futureKeywordsSet.add("SQLSTATE");
		futureKeywordsSet.add("SQLWARNING");
		futureKeywordsSet.add("START");
		futureKeywordsSet.add("STATE");
		futureKeywordsSet.add("STATEMENT");
		futureKeywordsSet.add("STATIC");
		futureKeywordsSet.add("STDDEV_POP");
		futureKeywordsSet.add("STDDEV_SAMP");
		futureKeywordsSet.add("STRUCTURE");
		futureKeywordsSet.add("SUBMULTISET");
		futureKeywordsSet.add("SUBSTRING_REGEX");
		futureKeywordsSet.add("SYMMETRIC");
		futureKeywordsSet.add("SYSTEM");
		futureKeywordsSet.add("TEMPORARY");
		futureKeywordsSet.add("TERMINATE");
		futureKeywordsSet.add("THAN");
		futureKeywordsSet.add("TIME");
		futureKeywordsSet.add("TIMESTAMP");
		futureKeywordsSet.add("TIMEZONE_HOUR");
		futureKeywordsSet.add("TIMEZONE_MINUTE");
		futureKeywordsSet.add("TRAILING");
		futureKeywordsSet.add("TRANSLATE_REGEX");
		futureKeywordsSet.add("TRANSLATION");
		futureKeywordsSet.add("TREAT");
		futureKeywordsSet.add("TRUE");
		futureKeywordsSet.add("UESCAPE");
		futureKeywordsSet.add("UNDER");
		futureKeywordsSet.add("UNKNOWN");
		futureKeywordsSet.add("UNNEST");
		futureKeywordsSet.add("USAGE");
		futureKeywordsSet.add("USING");
		futureKeywordsSet.add("VALUE");
		futureKeywordsSet.add("VAR_POP");
		futureKeywordsSet.add("VAR_SAMP");
		futureKeywordsSet.add("VARCHAR");
		futureKeywordsSet.add("VARIABLE");
		futureKeywordsSet.add("WHENEVER");
		futureKeywordsSet.add("WIDTH_BUCKET");
		futureKeywordsSet.add("WITHOUT");
		futureKeywordsSet.add("WINDOW");
		futureKeywordsSet.add("WITHIN");
		futureKeywordsSet.add("WORK");
		futureKeywordsSet.add("WRITE");
		futureKeywordsSet.add("XMLAGG");
		futureKeywordsSet.add("XMLATTRIBUTES");
		futureKeywordsSet.add("XMLBINARY");
		futureKeywordsSet.add("XMLCAST");
		futureKeywordsSet.add("XMLCOMMENT");
		futureKeywordsSet.add("XMLCONCAT");
		futureKeywordsSet.add("XMLDOCUMENT");
		futureKeywordsSet.add("XMLELEMENT");
		futureKeywordsSet.add("XMLEXISTS");
		futureKeywordsSet.add("XMLFOREST");
		futureKeywordsSet.add("XMLITERATE");
		futureKeywordsSet.add("XMLNAMESPACES");
		futureKeywordsSet.add("XMLPARSE");
		futureKeywordsSet.add("XMLPI");
		futureKeywordsSet.add("XMLQUERY");
		futureKeywordsSet.add("XMLSERIALIZE");
		futureKeywordsSet.add("XMLTABLE");
		futureKeywordsSet.add("XMLTEXT");
		futureKeywordsSet.add("XMLVALIDATE");
		futureKeywordsSet.add("YEAR");
		futureKeywordsSet.add("ZONE");
	
	}
	public static boolean checkIfFuture(String keyword) {
		if(keyword == null) {
			return false;
		} else {				
			keyword = keyword.toUpperCase();
			return futureKeywordsSet.contains(keyword);
		}
	}

}
