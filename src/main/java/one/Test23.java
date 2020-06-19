package one;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dyh
 * @date 2020/6/2
 */
public class Test23 {
    public static void main(String[] args) {
        String s="254,631,864,890,891,892,2065,2147,2148,2218,2220,2221,2222,2231,13,97,134,269,324,429,636,637,638,639,640,641,642,643,648,763,865,866,867,868,919,1011,1107,1146,1210,1233,1392,1413,1548,1736,1782,1971,1976,1979,2134,2146,2217,2223,2224,2225,2226,2227,2228,2229,2232,2285,2463,2465,2466,2511,2536,2543,2552,2565,2573,2574,2602,2617,24,40,42,156,257,268,301,343,345,378,430,431,432,433,647,649,776,838,878,884,893,953,992,1012,1046,1096,1097,1098,1212,1457,1600,1711,1724,1735,1777,1783,1836,1853,1870,1977,2007,2008,2009,2016,2067,2068,2118,2144,2211,2216,2219,2230,2234,2255,2278,2283,2286,2299,2301,2302,2307,2308,2309,2319,2321,2322,2332,2333,2343,2382,2383,2384,2385,2386,2387,2388,2389,2390,2391,2392,2394,2396,2397,2404,2405,2406,2409,2410,2411,2414,2417,2418,2419,2420,2421,2422,2423,2424,2425,2426,2427,2428,2429,2430,2432,2433,2435,2438,2439,2440,2442,2448,2457,2476,2493,2506,2512,2526,2528,2535,2538,2550,2553,2554,2559,2560,2566,2593,2603,2611,2612,2616,2621,60,65,70,147,148,152,191,214,252,271,274,291,335,336,337,340,341,344,346,347,349,350,351,352,355,356,388,461,608,609,625,626,627,650,651,665,707,708,721,724,740,741,750,760,762,772,777,804,805,807,813,814,821,824,826,827,869,870,897,935,951,956,957,958,980,1039,1047,1048,1049,1053,1065,1066,1067,1083,1103,1129,1142,1143,1144,1149,1154,1156,1234,1243,1258,1277,1278,1279,1280,1281,1282,1283,1284,1291,1301,1347,1373,1378,1417,1453,1536,1537,1553,1556,1561,1571,1593,1594,1601,1613,1624,1626,1631,1641,1655,1659,1688,1705,1710,1718,1743,1744,1764,1770,1774,1785,1786,1787,1788,1789,1798,1799,1800,1810,1811,1812,1818,1819,1822,1824,1828,1835,1837,1844,1854,1859,1860,1861,1872,1876,1877,1878,1880,1885,1889,1892,1895,1900,1902,1911,1913,1922,1926,1928,1935,1936,1937,1943,1944,1947,1948,1954,1969,1975,1982,1990,1991,1998,2010,2011,2012,2013,2014,2015,2017,2018,2022,2028,2055,2057,2059,2061,2066,2070,2073,2074,2077,2127,2129,2132,2142,2209,2210,2212,2213,2215,2261,2264,2268,2273,2279,2280,2282,2284,2287,2288,2289,2290,2296,2297,2303,2304,2305,2323,2324,2325,2326,2327,2330,2334,2336,2337,2338,2342,2344,2345,2346,2347,2348,2349,2393,2395,2398,2399,2400,2401,2402,2403,2407,2408,2412,2413,2415,2416,2431,2434,2444,2445,2446,2447,2449,2450,2456,2458,2459,2460,2464,2467,2470,2471,2473,2477,2478,2479,2497,2498,2499,2500,2501,2502,2503,2507,2508,2509,2510,2513,2514,2523,2525,2529,2531,2544,2546,2556,2561,2563,2567,2571,2572,2575,2591,2594,2595,2604,2607,2615,2618,2619,2620,61,62,67,75,88,92,104,165,183,184,185,187,194,208,209,210,223,226,246,270,287,290,293,294,295,298,299,300,304,309,322,323,326,327,338,342,348,353,368,369,373,374,375,376,377,379,384,385,386,387,389,390,391,392,393,394,395,396,397,398,399,400,402,403,407,408,409,462,469,679,680,681,700,709,711,716,720,746,785,798,799,800,802,803,812,815,822,825,829,830,851,852,857,876,880,881,894,895,899,901,914,917,928,929,939,941,942,943,944,947,962,963,974,981,982,983,984,985,1002,1007,1015,1018,1019,1023,1024,1059,1070,1075,1094,1104,1105,1106,1122,1123,1125,1196,1260,1319,1327,1361,1363,1379,1380,1396,1418,1419,1421,1430,1454,1455,1477,1478,1550,1551,1554,1555,1557,1558,1562,1565,1566,1581,1602,1614,1615,1618,1619,1625,1627,1632,1633,1635,1646,1650,1656,1660,1661,1662,1663,1664,1665,1666,1667,1668,1671,1672,1673,1674,1680,1684,1689,1726,1730,1745,1746,1747,1748,1749,1750,1751,1752,1753,1754,1755,1756,1757,1758,1759,1760,1766,1768,1778,1792,1793,1794,1795,1796,1797,1801,1802,1820,1823,1825,1833,1838,1839,1842,1845,1852,1855,1856,1862,1863,1864,1865,1886,1887,1888,1890,1896,1897,1901,1905,1906,1907,1908,1924,1925,1927,1930,1932,1940,1941,1945,1946,1949,1955,1957,1963,1964,1965,1967,1978,1981,1984,1985,1986,1987,1988,1989,1992,2019,2023,2049,2060,2071,2072,2075,2076,2100,2103,2104,2105,2106,2107,2108,2117,2119,2123,2214,2259,2262,2263,2265,2266,2267,2269,2270,2271,2274,2275,2276,2277,2291,2312,2313,2314,2317,2318,2331,2339,2340,2341,2350,2351,2352,2353,2354,2355,2356,2357,2358,2359,2360,2361,2362,2363,2364,2365,2366,2367,2368,2369,2370,2371,2372,2373,2374,2375,2376,2377,2378,2379,2380,2381,2468,2472,2474,2475,2480,2481,2490,2491,2515,2516,2517,2518,2520,2521,2522,2524,2530,2532,2533,2534,2537,2545,2547,2548,2551,2562,2564,2568,2569,2570,2576,2577,2578,2579,2580,2581,2582,2583,2584,2585,2586,2587,2589,2590,2597,2606,2608,2609,2613,2614,63,71,168,180,181,188,204,205,206,207,211,212,213,227,228,229,230,265,289,308,310,330,331,332,333,357,358,359,360,361,363,364,365,370,371,372,380,383,401,404,405,406,465,466,467,624,717,756,757,767,778,779,788,789,790,791,793,794,795,796,797,816,836,854,858,879,885,886,920,923,924,932,945,946,964,966,976,978,979,990,991,997,998,999,1000,1001,1042,1074,1099,1100,1101,1118,1121,1126,1127,1128,1159,1166,1167,1168,1203,1204,1207,1208,1244,1266,1295,1305,1326,1374,1386,1387,1391,1424,1452,1456,1462,1463,1531,1532,1549,1559,1567,1568,1573,1575,1582,1589,1590,1591,1592,1605,1606,1607,1608,1609,1611,1616,1622,1623,1636,1640,1642,1643,1644,1645,1647,1649,1653,1654,1675,1679,1682,1683,1685,1691,1696,1717,1722,1723,1727,1733,1734,1741,1773,1776,1803,1804,1808,1814,1815,1821,1827,1829,1831,1834,1848,1849,1868,1875,1898,1899,1904,1914,1918,1921,1942,1953,1993,1999,2004,2064,2120,2121,2122,2125,2126,2138,2143,2236,2237,2253,2254,2272,2492,2505,2519,2527,2539,2540,2541,2542,2557,2588,2592,72,74,266,780,801,859,921,922,1043,1093,1095,1273,1317,1318,1381,1382,1383,1401,1420,1449,1450,1533,1572,1586,1587,1596,1597,1598,1599,1637,1638,1707,1713,1714,1732,1767,1832,1840,1841,1850,1851,1866,1867,1894,1929,1956,1959,1960,1973,1994,1995,1996,2006,2024,2025,2026,2027,2029,2139,2140,2141,2238,2239,2248,2249,2250,2251,2252,2260,2315,2316,2494,2495,2496,2504,2549,2558,2598,2599,2600,1639,1681,1775,1830,1912,1939,2003,2062,2240,2241,2242,2243,2244,2245,2246,2247,2489";
        String[] split = s.split(",");
        List<String> list = Arrays.asList(split);
        List<Integer> collect = list.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        Collections.sort(collect);
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer s1 : collect) {
            stringBuilder.append(s1).append(",");
        }
//        System.out.println(stringBuilder);
        System.out.println(System.currentTimeMillis());
    }
}
