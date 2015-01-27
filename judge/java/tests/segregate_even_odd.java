package tests;
import java.util.*;
import java.lang.*;
import java.io.*;
import judge.*;

public class segregate_even_odd {
    public static int num_test = 50;
    public static int[][] in_0 = {{11, 14, 8, 3, 11, 17, 18, 17, 8}, {6, 7, 12, 9, 10, 14, 14, 5, 3}, {17, 4, 1, 14, 7, 15, 14, 17}, {14, 15, 4, 7, 12, 8}, {12, 10, 18, 1, 8, 10, 20, 18, 9, 4}, {17, 108, 69, 22, 15, 20, 104, 143, 128, 176, 89, 140, 89, 131, 19, 128, 14, 160, 194, 82, 180, 199, 114, 138, 37, 108, 69, 104, 7, 130}, {181, 22, 161, 92, 25, 45, 34, 162, 173, 61, 132, 3, 123, 111, 26, 92, 31, 144, 197, 168, 139, 14, 141, 113, 183, 108, 114, 52, 54, 128, 176, 91, 16, 120, 110, 43}, {87, 90, 141, 157, 125, 78, 20, 97, 159, 79, 55, 3, 10, 98, 160, 77, 4, 6, 74, 187, 196, 192, 110, 15, 54, 92, 174, 177, 44, 20, 159, 5, 55, 101, 36, 128, 74, 160}, {47, 51, 149, 147, 133, 6, 33, 194, 38, 78, 117, 90, 146, 142, 79, 53, 199, 33, 159, 148, 176, 136, 30, 167, 173, 72, 128, 18, 125, 170, 194, 66, 49, 84, 105}, {130, 148, 100, 177, 175, 33, 86, 64, 113, 183, 117, 106, 145, 190, 132, 93, 161, 160, 3, 130, 7, 175, 173, 70}, {64, 158, 123, 172, 59, 120, 147, 74, 15, 116, 38, 14, 77, 164, 193, 150, 144, 187, 112, 119, 174, 67, 17, 60, 77, 28, 142, 75, 12, 132, 101, 132, 153, 164, 191, 122, 106, 181, 84, 85, 22}, {166, 145, 62, 181, 3, 42, 76, 16, 61, 184, 199, 8, 89, 90, 42, 144, 108, 134, 11, 93, 133, 105, 86, 77, 93, 122}, {191, 132, 111, 171, 175, 93, 161, 68, 82, 169, 119, 66, 108, 195, 30, 34, 140, 79, 185, 38, 181, 42, 177, 98, 92, 167, 133}, {74, 138, 105, 84, 159, 15, 169, 15, 132, 153, 83, 38, 155, 165, 79, 197, 37, 3, 11, 32, 84, 123, 60, 135, 159, 90, 58, 11, 4, 138, 146, 160, 28, 139, 117, 10, 3, 157, 92, 89, 191, 100, 197, 52, 7, 125, 32, 109}, {11, 89, 13, 13, 60, 196, 71, 95, 129, 79, 191, 85, 116, 137, 3, 6, 81, 163, 137, 160, 104, 14, 0, 28, 151, 44, 54, 186, 117, 114, 166, 191, 89, 119, 131, 81, 74, 177, 43, 187, 100, 92, 70, 66, 111, 139, 93, 22, 169, 13}, {165, 52, 68, 140, 141, 190, 44, 7, 148, 166, 104, 127, 142, 40, 5, 133, 36, 5, 103, 194, 121, 179, 92, 130, 160, 62, 141, 118, 13, 124, 64, 56, 2, 139, 71, 124, 151, 48, 42, 100, 125, 134, 135, 144, 84, 200, 80, 50, 154}, {71, 199, 124, 88, 199, 100, 48, 7, 136, 10, 69, 189, 77, 145, 119, 160, 50, 70, 119, 144, 164, 40, 192, 88, 58, 81, 136, 134, 113, 34, 151, 130, 187, 27, 172, 88, 188, 33, 196, 44}, {67, 82, 73, 50, 122, 62, 185, 108, 159, 88, 52, 68, 35, 142, 98, 69, 195, 15, 63}, {90, 33, 36, 136, 183, 124, 177, 76, 198, 65, 177, 71, 108, 50, 58, 33, 12, 29, 54, 17, 98, 129, 40, 183, 106, 146, 149, 105, 171, 102, 125}, {196, 155, 4, 116, 131, 136, 177, 121, 101, 175, 3, 155, 15, 45, 16, 124, 17, 36, 82, 108, 151, 141, 170, 12, 47, 19, 117, 147, 88, 193, 196, 74, 112, 22, 112, 27, 181, 27, 191, 18, 91}, {6415, 6266, 9617, 5441, 1321, 5608, 3277, 9455, 1026, 3726, 5087, 3151, 3289, 8776, 4093, 4020, 8507, 2519, 1760, 2335, 122, 7564, 5367, 1437, 8642, 1585, 1331, 2896, 7068, 6622, 4541, 3918, 2762, 5065, 1511, 7023, 2204, 2976, 9213, 4992, 1331, 8445, 5571, 6786, 8344, 4174, 2161, 6879, 1940, 6867, 8591, 749, 4802, 3976, 2320, 3712, 7368, 4311, 8437, 2555, 2811, 2618, 2414, 2374, 9134, 5435, 6832, 7492, 4202, 562, 5329, 6665, 8543, 7340, 8129, 6246, 1444, 4781, 8886, 4056, 2317, 5770, 9093, 1354, 7919, 6428, 2983, 6435, 2476, 6791, 6346, 2113, 1913, 7444, 4938, 1095, 2704, 4028, 6292, 2109}, {1028, 7858, 4677, 1585, 6976, 1164, 6936, 7924, 5577, 6762, 5009, 2873, 3479, 2076, 9912, 5868, 5812, 1463, 8668, 9948, 5402, 5984, 4254, 5134, 4017, 7649, 5154, 1804, 2185, 4684, 3180, 2487, 5872, 5943, 5663, 2416, 7808, 8590, 6122, 4872, 3482, 6463, 7879, 7295, 3003, 5853, 5099, 9137, 8073, 2362, 8899, 5563, 4592, 6073, 5830, 5478, 140, 1629, 3828, 8157, 2230, 4747, 4512, 9775, 1159, 3346, 2476, 5027, 9403, 343, 1351, 2535, 2384, 5975, 5343, 5056, 6279, 2202, 4769, 330, 7342, 5390, 8136, 8954, 1526, 9993, 6306, 6276, 5155, 6425, 1015, 443}, {5251, 5049, 1685, 9194, 2461, 9848, 8752, 5465, 2383, 1476, 2174, 8154, 6136, 9042, 3767, 3909, 7869, 9929, 8789, 9166, 4206, 1779, 2413, 9210, 3821, 5252, 4526, 6485, 6095, 8224, 1067, 2327, 8058, 1698, 1398, 6868, 3186, 940, 336, 1242, 7948, 1065, 8035, 9379, 6454, 9597, 9183, 3165, 2271, 3996, 3833, 6396, 8003, 1987, 6311, 4538}, {72, 5429, 5065, 3995, 8421, 67, 9096, 8190, 9156, 4859, 6628, 4093, 1795, 2598, 4249, 6590, 7568, 8387, 3090, 6776, 9626, 3564, 4172, 6555, 1714, 7968, 6394, 5063, 3503, 6094, 8537, 669, 9019, 7609, 5692, 3413, 6336, 2868, 4942, 3476, 3983, 8296, 5208, 1268, 5295, 2304, 7508, 3921, 3650, 1269, 2092, 1723, 6029, 4943, 1632, 2854, 5514, 3330, 7239, 6099, 4953, 6705, 6931, 4827, 5681, 3319}, {2771, 1045, 453, 1834, 5315, 691, 3465, 594, 2319, 8259, 7479, 7398, 9390, 4221, 1613, 8052, 9654, 9885, 4412, 3761, 4159, 6399, 8841, 1461, 4338, 1353, 3499, 6718, 9335, 60, 4392, 2590, 9264, 4864, 5882, 1888, 1596, 7609, 9583, 4329, 4463, 5995, 3647, 2525, 5712, 4572, 4344, 9296, 5961, 4216, 92, 2508, 4021, 1139, 4674}, {3256, 2711, 1141, 3736, 3203, 2848, 1578, 9392, 8412, 3192, 4139, 7482, 3436, 3732, 5611, 7588, 6528, 4889, 5362, 9528, 3600, 544, 6183, 5442, 1897, 6550, 1860, 7349, 3531, 5705, 3970, 8834, 4240, 6915, 8346, 6479, 1863, 9275, 2538, 7585, 4944, 4762, 2396, 6263, 4525, 6304, 3300, 4937, 8369, 4429, 5700, 7620, 8739, 6060, 8598, 9797, 7935, 1221, 3397, 1430, 2071, 9226, 5056, 7350, 4761, 7031, 1735, 6771, 1020, 6811, 8652, 1866, 5554, 9945, 2929, 6131, 3281, 5678, 4588, 5492}, {2761, 8119, 421, 6575, 2847, 8014, 3609, 9994, 9349, 6536, 7414, 6733, 390, 5224, 1611, 6810, 302, 232, 277, 6014, 1563, 8467, 8112, 7022, 632, 6273, 6806, 962, 7777, 8229, 3507, 5524, 9927, 6767, 4061, 4634, 5069, 8579, 8927, 9017, 9546, 9107, 1298, 5814, 6086, 3897, 9472, 8701, 7533, 8363, 878, 2796, 5032, 5675, 9472, 7027, 9898, 125, 8073, 308, 1910, 5907, 6522, 2390, 4757, 2125, 5664, 4641, 9893, 7707, 8882, 338, 2281, 1932, 7767, 1149, 6429, 7566, 9095, 1234, 7812, 5276, 603, 5754, 3860, 5025, 2153}, {3057, 8163, 839, 4025, 1398, 5426, 2231, 8075, 3991, 9553, 5224, 564, 3963, 4706, 4537, 2069, 2536, 7293, 1747, 1929, 214, 5900, 4388, 9420, 6970, 160, 9418, 6596, 1025, 548, 5791, 191, 3700, 4190, 7378, 458, 3812, 4357, 13, 3204, 7473, 8950, 5528, 6594, 4100, 4999, 699, 7626, 8536, 4430, 3622, 7106, 5587, 8225, 7815, 1255, 6573, 8963, 1580, 6788, 9720, 8587, 951, 2723, 3077, 9152, 9773, 2942, 9413, 2158, 6160, 9789, 6355, 6134, 1688}, {3565, 5357, 4887, 6945, 2869, 4588, 2593, 8631, 9640, 1860, 263, 4065, 3040, 1721, 215, 8280, 5435, 389, 355, 1526, 179, 2063, 4381, 6452, 6164, 4032, 2777, 7540, 8618, 2657, 5104, 8605, 3878, 2501, 6835, 7280, 7736, 9184, 117, 7292, 9852, 2711, 2882, 9381, 6733, 6830, 2929, 7385, 6529, 4379, 1489, 8282, 9553}, {1583, 6155, 9503, 9501, 4610, 1233, 6884, 7764, 4055, 4606, 9357, 5653, 9592, 6323, 1714, 5129, 6806, 7463, 7316, 5339, 3557, 8267, 5161, 5533, 3926, 2108, 1909, 1279, 7361, 6547, 418, 5483, 6086, 5565, 7443, 5837, 1582, 4103, 7635, 5093, 2198, 2718, 8690, 4516, 9525, 7842, 3197, 1575, 2090, 543, 1580, 3385, 3343, 307, 8891, 311, 2102, 5120, 8642, 330, 147, 7800, 2071, 7105, 8863, 988, 8071, 5073, 4594, 7396, 6068, 8849, 2331, 5320, 6734, 599, 680, 8901, 9832, 8174, 337, 6289, 4687, 9390, 8820, 4876, 4859, 7090, 8545, 4157, 9598, 3111, 3200, 2233, 6252, 4871, 2372, 1240}, {5120, 4483, 4346, 1060, 5302, 6722, 4135, 8886, 5583, 5275, 8243, 939, 2992, 7940, 9169, 9982, 5210, 5944, 8242, 6021, 5463, 912, 3984, 2259, 2648, 3340, 8543, 9120, 1197, 6231, 1970, 2320, 5800, 9541, 9484, 6534, 1109, 2544, 3793, 7912, 375, 617, 7502, 6748, 8763, 9473, 5298, 6514, 6443, 2790, 6730, 7341, 7379, 1002, 2106, 4815, 3179, 8748, 1287, 7026, 1127, 4212, 7547, 1035, 7269, 7598, 6065, 9957, 9407, 3568, 8227, 4326, 8935, 6220, 4482, 5429, 8219, 1136, 7599, 600, 3501, 9193, 3564, 1632, 1152, 6541, 8152, 6598, 4837, 3769, 9280, 2155, 6444, 3543, 2914, 8494, 8651, 3824, 5235}, {9904, 8211, 5310, 7088, 6269, 3766, 537, 6330, 5947, 5452, 4580, 4297, 3703, 8416, 8145, 174, 4143, 3579, 411, 1540, 4754, 13, 8252, 604, 6427, 8862, 2878, 4119, 2959, 2451, 8580, 3102, 8612, 6851, 547, 4728, 6866, 4869, 8599, 4556, 326, 7047, 3483, 2920, 9511, 2312, 5208, 8847, 7606, 5208, 846, 5635, 5551, 9845, 8629, 4506, 9009, 424, 487, 1078, 2585, 4626, 3717, 6592, 8758, 2889, 5515, 5645, 7853, 9696, 2224, 4993, 9949, 1694, 842, 6306, 2229, 8027, 8256, 2004}, {8070, 8571, 4106, 8149, 940, 7654, 709, 5386, 6378, 2575, 5756, 4247, 6341, 2207, 7887, 6650, 6003, 4062, 1812, 4664, 2468, 3893, 3747, 2195, 2235, 8079, 5184, 4368, 8676, 8010, 9709, 4430, 7632, 5426, 8773, 8938, 1504, 3812, 3617, 6620, 4561, 8893, 2966, 247, 2306, 1857, 4474, 2312, 2786, 0, 1148, 3528, 9793, 2592, 7130, 1090}, {9432, 350, 601, 6394, 5144, 3221, 8640, 1774, 7331, 3935, 8623, 9729, 4990, 5582, 3806, 7924, 5863, 9051, 2728, 4044, 3719, 7369, 8086, 7180, 8022, 9727, 9437, 7631, 12, 9619, 7182, 7386, 8178, 1365, 1964, 7617, 9712, 1662, 1542, 8525, 2435, 2344, 1991, 5922, 4395, 886, 4825, 2882, 5896, 7398, 5915, 6445, 451, 1565, 2720, 2268, 441, 2861, 6248, 4881, 3887, 7354, 6550, 3815, 8438}, {1917, 3925, 314, 9133, 2817, 5185, 9117, 9337, 5168, 6903, 2789, 4890, 8957, 1339, 7097, 586, 1801, 2731, 4288, 746, 3540, 5145, 9346, 4680, 8720, 4447, 5487, 2034, 8548, 8964, 3754, 4833, 5273, 3386, 7985, 4537, 3410, 6534, 7399, 6574, 6586, 1777, 8775, 1994, 768, 6227, 4760, 8035, 3054, 27, 9947, 3949, 7428, 14, 6245, 1725, 8626, 9840, 3485, 5313, 6345, 9604, 6653, 6112, 2293, 8595, 3206, 1295, 4907, 3398, 5387, 3820, 700, 8327, 7199, 4442, 6089, 2072, 1960, 9432, 5563, 5372, 3127, 945, 3920, 4165, 1930, 3179, 9006, 3518, 5161, 8159, 5582, 8267}, {3723, 11, 4102, 541, 5761, 5737, 7535, 4757, 4515, 3146, 1081, 1864, 8799, 1461, 3549, 4009, 3697, 1549, 4723, 4267, 9006, 7927, 9090, 4571, 6516, 8332, 1792, 540, 3634, 1232, 7397, 3801, 9742, 5510, 4563, 826, 508, 2351, 2579, 238, 3276, 2633, 229, 3049, 7760, 1613, 4261, 5549, 4630, 2765, 8292, 3317, 9016, 9328, 4856, 6471, 5375, 1243, 1967, 9545, 2597, 1286, 4942, 9666, 3306, 1419, 3672}, {5338, 7090, 7852, 7978, 4334, 747, 9337, 5683, 5798, 7979, 5789, 6928, 2343, 4619, 3562, 5519, 1280, 35, 8640, 7957, 6030, 6396, 1718, 9285, 8955, 6615, 1774, 1845, 1362, 8119, 1788, 8979, 3098, 9653, 8697, 1647, 5177, 7986, 7141, 417, 6194, 6164, 6709, 8754, 1186, 8381, 1814, 6255, 6504, 2095, 5490, 4631, 2227, 9769, 2498, 5691, 8056, 4660, 3065, 1147, 3789, 2827, 8112, 9146, 8794, 9236, 7106, 8310}, {9558, 6427, 1945, 7017, 8774, 8939, 1459, 5203, 1602, 7071, 7734, 4261, 1873, 8053, 2275, 2321, 3936, 7589, 3882, 3956, 432, 7638, 3427, 6921, 9807, 9466, 6344, 5100, 1804, 194, 5183, 1518, 3154, 7201, 5704, 2254, 9502, 3722, 4722, 2441, 8625, 155, 2711, 237, 6632, 8316, 622, 3566, 4521, 9138, 9742, 3735}, {935, 9569, 6306, 8970, 5088, 4734, 7082, 5402, 1204, 5749, 2194, 5944, 4331, 3866, 4687, 8765, 4057, 7043, 4136, 9984, 4247, 635, 1802, 9713, 6445, 8059, 5278, 3958, 6331, 5606, 4360, 2174, 8945, 6570, 3152, 9786, 9746, 3473, 7077, 7734, 768, 7716, 1119, 5254, 4402, 9701, 8375, 9142, 8580, 8536}, {2646, 124, 2058, 6526, 6561, 6774, 7755, 7383, 8626, 3691, 4224, 960, 9512, 7237, 7847, 2241, 1561, 5304, 8758, 9075, 8814, 6719, 2362, 6741, 1046, 912, 1860, 1453, 747, 648, 5272, 2937, 9247, 2005, 3720, 9042, 5653, 6410, 6075, 45, 3636, 8349, 242, 7259, 5474, 3472, 7900, 1592, 5549, 7695, 3011, 639, 9396, 4479, 4483, 3446, 9203, 6968, 2719, 2791, 8420, 4115, 6428, 5401, 3177, 2176, 5962, 7921, 3973, 7336, 1009, 5364, 7329, 7154}, {1930, 9345, 8128, 1534, 9457, 9534, 985, 5577, 2381, 1593, 2504, 540, 3149, 870, 7749, 4704, 3196, 6149, 1138, 825, 2583, 1707, 73, 5213, 9555, 9218, 4905, 9037, 6918, 4156, 5736, 656, 7986, 7612, 8978, 9485, 8143, 4660, 7579, 2090, 4539, 3520, 4297, 3240, 6569, 7251, 3067, 8249, 5488, 5075, 409, 3029, 4301, 6988, 6283, 120, 3383, 7069, 4910, 9997}, {5907, 6816, 646, 296, 1758, 6184, 9830, 6390, 2792, 5825, 9749, 8810, 7489, 857, 9339, 3986, 8439, 5498, 3397, 1300, 1529, 5447, 3251, 7358, 9293, 210, 2756, 6867, 7227, 5864, 8689, 2913, 7781, 2934, 3650, 816, 7515, 4138, 1374, 3907, 1997, 564, 1542, 9165, 1265, 1735, 4904, 9420, 9797, 8769, 4430, 6539, 2097, 9908, 5819, 693, 3245, 10000, 1576, 6237, 205, 8357}, {7925, 2264, 8550, 219, 7069, 7463, 3348, 8002, 9590, 3017, 6187, 4263, 8441, 6055, 7815, 4173, 4954, 9174, 7515, 1247, 9823, 5036, 5753, 236, 5606, 6691, 2235, 836, 9726, 4393, 7670, 6800, 405, 2595, 5487, 9893, 4601, 6185, 8766, 7153, 8286, 7307, 9375, 7335, 3524, 8453, 9414, 4226, 9549, 2926, 5029}, {9101, 1197, 8505, 9180, 5787, 1056, 7700, 2261, 7172, 3894, 400, 4383, 5379, 5163, 9373, 8160, 4669, 5155, 9948, 5906, 5748, 6752, 7755, 2502, 642, 2441, 1895, 8181, 5786, 8691, 4147, 4872, 848, 4030, 6332, 3121, 1692, 781, 4964, 9286, 8461, 9054, 119, 7092, 6998, 2030, 1668, 314, 760, 8152, 1672, 5278, 9436, 2955, 3355, 7369, 776, 5252, 3065, 2962, 1368, 1226, 4135, 4805, 3589, 4529, 6345, 8690, 6008, 3629, 896, 6721, 729, 8020, 2282, 2155, 8061, 245, 149, 4790, 1829, 3719, 3238, 2642}, {2650, 5053, 1894, 4600, 3165, 9884, 1366, 6654, 1301, 9038, 6408, 5295, 5165, 709, 5900, 2993, 3357, 7192, 3913, 6851, 554, 7478, 7958, 303, 7321, 9945, 5759, 5983, 3214, 4768, 79, 2902, 3999, 7534, 2599, 2503, 9730, 9274, 9675, 1145, 3743, 3062, 7307, 1528, 9814, 7285, 90, 8237, 8100, 5097, 5663, 5896, 7061, 9083, 955, 8919, 6524, 5516, 9229, 4892, 4044, 8531, 4146, 1480, 6578, 2153, 4926, 5156, 6723, 8828, 1362, 3316, 6323, 3914}, {5196, 6168, 2545, 6616, 8697, 6974, 9481, 5615, 3478, 2836, 5425, 3931, 4584, 1043, 4963, 7740, 6023, 3529, 6574, 9387, 6787, 5151, 8457, 4202, 2151, 8660, 1363, 7506, 1688, 296, 9769, 1038, 7775, 6054, 4851, 2817, 1853, 1959, 6462, 4083, 4904, 4538, 5981, 9274, 5818, 6591, 7677, 4171, 9192, 5103, 8572, 374, 2940, 7239, 2071, 4432, 7469, 4457, 3454, 984, 1830, 9488, 4747, 7349, 1683, 1588, 8722, 6548, 6234, 1395, 4793, 8898, 6392, 33, 9404, 8307, 7686, 3020, 5699, 2239, 1763, 6997, 5668, 8577, 8426, 7784, 72, 7863, 2333, 3715, 7297, 1568, 3785, 6450, 2133, 1513}, {3669, 6690, 2360, 6486, 388, 9570, 4561, 2924, 668, 7838, 5437, 4094, 8896, 8409, 1687, 5200, 126, 9074, 5009, 4685, 1506, 7037, 2817, 2334, 806, 9388, 6933, 9006, 2338, 1639, 8387, 812, 3778, 5386, 4996, 3736, 6384, 8658, 1471, 9866, 6503, 6955, 3209, 4077, 5925, 6757, 610, 9201, 9690, 9549, 2070, 2444, 8707, 9758, 8165, 5304, 6691}, {9242, 5192, 6328, 1119, 553, 9553, 5447, 3589, 259, 649, 8768, 3817, 214, 8260, 8236, 2250, 477, 413, 7949, 2760, 3054, 5561, 6060, 1921, 840, 2344, 7057, 7541, 7077, 7736, 8364, 1556, 1509, 1750, 8807, 4522, 3021, 4783, 4719, 863, 1555, 3912, 311, 1930, 7949, 638, 2913, 8419, 7598, 3904, 4257, 3035, 2574, 3640, 5750, 4837, 5148, 7790, 934, 8429, 7559, 5874, 3079, 4698, 2180, 1610, 4518, 7352, 3748, 821, 7096, 949, 9859, 607, 2913, 5243, 5609, 2246, 6407, 9587, 1093, 1059, 6224}, {9636, 4518, 6439, 3766, 9797, 7939, 4347, 3795, 1723, 589, 5306, 9654, 1974, 9760, 6462, 2080, 5214, 3485, 3695, 2892, 3999, 8115, 2662, 7092, 5203, 8800, 4499, 3026, 8006, 395, 89, 5721, 9602, 3055, 270, 764, 768, 134, 7631, 3253, 9139, 8513, 5222, 1293, 5233, 6455, 5515, 4157, 1845, 1632, 6579, 7834, 6427, 1423, 2399, 5585, 7338, 7178, 6893, 2322, 6625, 2074, 5009, 2240, 5477, 347}, {8034, 4072, 2154, 133, 1934, 6318, 9943, 4731, 9967, 5871, 4292, 154, 2554, 1414, 5808, 5046, 8818, 9235, 2969, 7360, 8032, 5217, 9407, 631, 1738, 7173, 1472, 9124, 3843, 9610, 4680, 7407, 4927, 762, 2965, 5178, 3279, 4104, 6856, 5847, 2819, 6041, 5583, 1727, 502, 9654, 8061, 8500, 473, 5741, 4318, 5591, 9917, 9659, 6836, 2, 4206, 6687, 6196, 4860, 9154, 6460, 7837, 8087, 9487, 2632, 1669, 2340, 8490, 6784, 3529, 4578, 7484, 9214, 8322, 4405, 8136, 5195, 4336, 7617, 4515, 6168, 7834, 5662, 7365, 745, 4703, 1588, 8109, 3380, 946, 5613, 1195, 5178, 6411, 3281, 1186, 8228, 8496}};
    public static int[][] in_org_0 = test_common.copy(in_0);
    public static int[][] out = {{8, 14, 8, 18, 11, 17, 3, 17, 11}, {6, 14, 12, 14, 10, 9, 7, 5, 3}, {14, 4, 14, 1, 7, 15, 17, 17}, {14, 8, 4, 12, 7, 15}, {12, 10, 18, 4, 8, 10, 20, 18, 9, 1}, {130, 108, 104, 22, 108, 20, 104, 138, 128, 176, 114, 140, 180, 82, 194, 128, 14, 160, 19, 131, 89, 199, 89, 143, 37, 15, 69, 69, 7, 17}, {110, 22, 120, 92, 16, 176, 34, 162, 128, 54, 132, 52, 114, 108, 26, 92, 14, 144, 168, 197, 139, 31, 141, 113, 183, 111, 123, 3, 61, 173, 45, 91, 25, 161, 181, 43}, {160, 90, 74, 128, 36, 78, 20, 20, 44, 174, 92, 54, 10, 98, 160, 110, 4, 6, 74, 192, 196, 187, 77, 15, 3, 55, 79, 177, 159, 97, 159, 5, 55, 101, 125, 157, 141, 87}, {84, 66, 194, 170, 18, 6, 128, 194, 38, 78, 72, 90, 146, 142, 30, 136, 176, 148, 159, 33, 199, 53, 79, 167, 173, 117, 33, 133, 125, 147, 149, 51, 49, 47, 105}, {130, 148, 100, 70, 130, 160, 86, 64, 132, 190, 106, 117, 145, 183, 113, 93, 161, 33, 3, 175, 7, 175, 173, 177}, {64, 158, 22, 172, 84, 120, 106, 74, 122, 116, 38, 14, 164, 164, 132, 150, 144, 132, 112, 12, 174, 142, 28, 60, 77, 17, 67, 75, 119, 187, 101, 193, 153, 77, 191, 15, 147, 181, 59, 85, 123}, {166, 122, 62, 86, 134, 42, 76, 16, 108, 184, 144, 8, 42, 90, 89, 199, 61, 3, 11, 93, 133, 105, 181, 77, 93, 145}, {92, 132, 98, 42, 38, 140, 34, 68, 82, 30, 108, 66, 119, 195, 169, 161, 93, 79, 185, 175, 181, 171, 177, 111, 191, 167, 133}, {74, 138, 32, 84, 52, 100, 92, 10, 132, 28, 160, 38, 146, 138, 4, 58, 90, 60, 84, 32, 11, 123, 3, 135, 159, 37, 197, 11, 79, 165, 155, 83, 153, 139, 117, 15, 3, 157, 169, 89, 191, 15, 197, 159, 7, 125, 105, 109}, {22, 66, 70, 92, 60, 196, 100, 74, 166, 114, 186, 54, 116, 44, 28, 6, 0, 14, 104, 160, 137, 163, 81, 3, 151, 137, 85, 191, 117, 79, 129, 191, 89, 119, 131, 81, 95, 177, 43, 187, 71, 13, 13, 89, 111, 139, 93, 11, 169, 13}, {154, 52, 68, 140, 50, 190, 44, 80, 148, 166, 104, 200, 142, 40, 84, 144, 36, 134, 100, 194, 42, 48, 92, 130, 160, 62, 124, 118, 2, 124, 64, 56, 13, 139, 71, 141, 151, 179, 121, 103, 125, 5, 135, 133, 5, 127, 7, 141, 165}, {44, 196, 124, 88, 188, 100, 48, 88, 136, 10, 172, 130, 34, 134, 136, 160, 50, 70, 58, 144, 164, 40, 192, 88, 119, 81, 119, 145, 113, 77, 151, 189, 187, 27, 69, 7, 199, 33, 199, 71}, {98, 82, 142, 50, 122, 62, 68, 108, 52, 88, 159, 185, 35, 73, 67, 69, 195, 15, 63}, {90, 102, 36, 136, 146, 124, 106, 76, 198, 40, 98, 54, 108, 50, 58, 12, 33, 29, 71, 17, 177, 129, 65, 183, 177, 183, 149, 105, 171, 33, 125}, {196, 18, 4, 116, 112, 136, 22, 112, 74, 196, 88, 12, 170, 108, 16, 124, 82, 36, 17, 45, 151, 141, 15, 155, 47, 19, 117, 147, 3, 193, 175, 101, 121, 177, 131, 27, 181, 27, 191, 155, 91}, {6292, 6266, 4028, 2704, 4938, 5608, 7444, 6346, 1026, 3726, 2476, 6428, 1354, 8776, 5770, 4020, 4056, 8886, 1760, 1444, 122, 7564, 6246, 7340, 8642, 562, 4202, 2896, 7068, 6622, 7492, 3918, 2762, 6832, 9134, 2374, 2204, 2976, 2414, 4992, 2618, 7368, 3712, 6786, 8344, 4174, 2320, 3976, 1940, 4802, 8591, 749, 6867, 6879, 2161, 5571, 8445, 4311, 8437, 2555, 2811, 1331, 9213, 7023, 1511, 5435, 5065, 4541, 1331, 1585, 5329, 6665, 8543, 1437, 8129, 5367, 2335, 4781, 2519, 8507, 2317, 4093, 9093, 3289, 7919, 3151, 2983, 6435, 5087, 6791, 9455, 2113, 1913, 3277, 1321, 1095, 5441, 9617, 6415, 2109}, {1028, 7858, 6276, 6306, 6976, 1164, 6936, 7924, 1526, 6762, 8954, 8136, 5390, 2076, 9912, 5868, 5812, 7342, 8668, 9948, 5402, 5984, 4254, 5134, 330, 2202, 5154, 1804, 5056, 4684, 3180, 2384, 5872, 2476, 3346, 2416, 7808, 8590, 6122, 4872, 3482, 4512, 2230, 3828, 140, 5478, 5830, 4592, 2362, 8073, 8899, 5563, 9137, 6073, 5099, 5853, 3003, 1629, 7295, 8157, 7879, 4747, 6463, 9775, 1159, 5663, 5943, 5027, 9403, 343, 1351, 2535, 2487, 5975, 5343, 2185, 6279, 7649, 4769, 4017, 1463, 3479, 2873, 5009, 5577, 9993, 1585, 4677, 5155, 6425, 1015, 443}, {4538, 6396, 3996, 9194, 6454, 9848, 8752, 7948, 1242, 1476, 2174, 8154, 6136, 9042, 336, 940, 3186, 6868, 1398, 9166, 4206, 1698, 8058, 9210, 8224, 5252, 4526, 6485, 6095, 3821, 1067, 2327, 2413, 1779, 8789, 9929, 7869, 3909, 3767, 2383, 5465, 1065, 8035, 9379, 2461, 9597, 9183, 3165, 2271, 1685, 3833, 5049, 8003, 1987, 6311, 5251}, {72, 3330, 5514, 2854, 1632, 2092, 9096, 8190, 9156, 3650, 6628, 7508, 2304, 2598, 1268, 6590, 7568, 5208, 3090, 6776, 9626, 3564, 4172, 8296, 1714, 7968, 6394, 3476, 4942, 6094, 2868, 6336, 5692, 7609, 9019, 3413, 669, 8537, 3503, 5063, 3983, 6555, 8387, 4249, 5295, 1795, 4093, 3921, 4859, 1269, 67, 1723, 6029, 4943, 8421, 3995, 5065, 5429, 7239, 6099, 4953, 6705, 6931, 4827, 5681, 3319}, {4674, 2508, 92, 1834, 4216, 9296, 4344, 594, 4572, 5712, 1596, 7398, 9390, 1888, 5882, 8052, 9654, 4864, 4412, 9264, 2590, 4392, 60, 6718, 4338, 1353, 3499, 1461, 9335, 8841, 6399, 4159, 3761, 9885, 1613, 4221, 7479, 7609, 9583, 4329, 4463, 5995, 3647, 2525, 8259, 2319, 3465, 691, 5961, 5315, 453, 1045, 4021, 1139, 2771}, {3256, 5492, 4588, 3736, 5678, 2848, 1578, 9392, 8412, 3192, 5554, 7482, 3436, 3732, 1866, 7588, 6528, 8652, 5362, 9528, 3600, 544, 1020, 5442, 7350, 6550, 1860, 5056, 9226, 1430, 3970, 8834, 4240, 8598, 8346, 6060, 7620, 5700, 2538, 3300, 4944, 4762, 2396, 6304, 4525, 6263, 7585, 4937, 8369, 4429, 9275, 1863, 8739, 6479, 6915, 9797, 7935, 1221, 3397, 5705, 2071, 3531, 7349, 1897, 4761, 7031, 1735, 6771, 6183, 6811, 4889, 5611, 4139, 9945, 2929, 6131, 3281, 3203, 1141, 2711}, {3860, 5754, 5276, 7812, 1234, 8014, 7566, 9994, 1932, 6536, 7414, 338, 390, 5224, 8882, 6810, 302, 232, 5664, 6014, 2390, 6522, 8112, 7022, 632, 1910, 6806, 962, 308, 9898, 9472, 5524, 5032, 2796, 878, 4634, 9472, 6086, 5814, 1298, 9546, 9107, 9017, 8927, 8579, 3897, 5069, 8701, 7533, 8363, 4061, 6767, 9927, 5675, 3507, 7027, 8229, 125, 8073, 7777, 6273, 5907, 8467, 1563, 4757, 2125, 277, 4641, 9893, 7707, 1611, 6733, 2281, 9349, 7767, 1149, 6429, 3609, 9095, 2847, 6575, 421, 603, 8119, 2761, 5025, 2153}, {1688, 6134, 6160, 2158, 1398, 5426, 2942, 9152, 9720, 6788, 5224, 564, 1580, 4706, 7106, 3622, 2536, 4430, 8536, 7626, 214, 5900, 4388, 9420, 6970, 160, 9418, 6596, 4100, 548, 6594, 5528, 3700, 4190, 7378, 458, 3812, 8950, 3204, 13, 7473, 4357, 191, 5791, 1025, 4999, 699, 1929, 1747, 7293, 2069, 4537, 5587, 8225, 7815, 1255, 6573, 8963, 3963, 9553, 3991, 8587, 951, 2723, 3077, 8075, 9773, 2231, 9413, 4025, 839, 9789, 6355, 8163, 3057}, {8282, 6830, 2882, 9852, 7292, 4588, 9184, 7736, 9640, 1860, 7280, 3878, 3040, 5104, 8618, 8280, 7540, 4032, 6164, 1526, 6452, 2063, 4381, 179, 355, 389, 2777, 5435, 215, 2657, 1721, 8605, 4065, 2501, 6835, 263, 8631, 2593, 117, 2869, 6945, 2711, 4887, 9381, 6733, 5357, 2929, 7385, 6529, 4379, 1489, 3565, 9553}, {1240, 2372, 6252, 3200, 4610, 9598, 6884, 7764, 7090, 4606, 4876, 8820, 9592, 9390, 1714, 8174, 6806, 9832, 7316, 680, 6734, 5320, 6068, 7396, 3926, 2108, 4594, 988, 7800, 330, 418, 8642, 6086, 5120, 2102, 1580, 1582, 2090, 7842, 4516, 2198, 2718, 8690, 5093, 9525, 7635, 3197, 1575, 4103, 543, 5837, 3385, 3343, 307, 8891, 311, 7443, 5565, 5483, 6547, 147, 7361, 2071, 7105, 8863, 1279, 8071, 5073, 1909, 5533, 5161, 8849, 2331, 8267, 3557, 599, 5339, 8901, 7463, 5129, 337, 6289, 4687, 6323, 5653, 9357, 4859, 4055, 8545, 4157, 1233, 3111, 9501, 2233, 9503, 4871, 6155, 1583}, {5120, 3824, 4346, 1060, 5302, 6722, 8494, 8886, 2914, 6444, 9280, 6598, 2992, 7940, 8152, 9982, 5210, 5944, 8242, 1152, 1632, 912, 3984, 3564, 2648, 3340, 600, 9120, 1136, 4482, 1970, 2320, 5800, 6220, 9484, 6534, 4326, 2544, 3568, 7912, 7598, 4212, 7502, 6748, 7026, 8748, 5298, 6514, 2106, 2790, 6730, 1002, 7379, 7341, 6443, 4815, 3179, 9473, 1287, 8763, 1127, 617, 7547, 1035, 7269, 375, 6065, 9957, 9407, 3793, 8227, 1109, 8935, 9541, 6231, 5429, 8219, 1197, 7599, 8543, 3501, 9193, 2259, 5463, 6021, 6541, 9169, 939, 4837, 3769, 8243, 2155, 5275, 3543, 5583, 4135, 8651, 4483, 5235}, {9904, 2004, 5310, 7088, 8256, 3766, 6306, 6330, 842, 5452, 4580, 1694, 2224, 8416, 9696, 174, 8758, 6592, 4626, 1540, 4754, 1078, 8252, 604, 424, 8862, 2878, 4506, 846, 5208, 8580, 3102, 8612, 7606, 5208, 4728, 6866, 2312, 2920, 4556, 326, 7047, 3483, 8599, 9511, 4869, 547, 8847, 6851, 2451, 2959, 5635, 5551, 9845, 8629, 4119, 9009, 6427, 487, 13, 2585, 411, 3717, 3579, 4143, 2889, 5515, 5645, 7853, 8145, 3703, 4993, 9949, 4297, 5947, 537, 2229, 8027, 6269, 8211}, {8070, 1090, 4106, 7130, 940, 7654, 2592, 5386, 6378, 3528, 5756, 1148, 0, 2786, 2312, 6650, 4474, 4062, 1812, 4664, 2468, 2306, 2966, 6620, 3812, 1504, 5184, 4368, 8676, 8010, 8938, 4430, 7632, 5426, 8773, 9709, 8079, 2235, 3617, 2195, 4561, 8893, 3747, 247, 3893, 1857, 6003, 7887, 2207, 6341, 4247, 2575, 9793, 709, 8149, 8571}, {9432, 350, 8438, 6394, 5144, 6550, 8640, 1774, 7354, 6248, 2268, 2720, 4990, 5582, 3806, 7924, 7398, 5896, 2728, 4044, 2882, 886, 8086, 7180, 8022, 5922, 2344, 1542, 12, 1662, 7182, 7386, 8178, 9712, 1964, 7617, 1365, 9619, 7631, 8525, 2435, 9437, 1991, 9727, 4395, 7369, 4825, 3719, 9051, 5863, 5915, 6445, 451, 1565, 9729, 8623, 441, 2861, 3935, 4881, 3887, 7331, 3221, 3815, 601}, {5582, 3518, 314, 9006, 1930, 3920, 5372, 9432, 5168, 1960, 2072, 4890, 4442, 700, 3820, 586, 3398, 3206, 4288, 746, 3540, 6112, 9346, 4680, 8720, 9604, 9840, 2034, 8548, 8964, 3754, 8626, 14, 3386, 7428, 3054, 3410, 6534, 4760, 6574, 6586, 768, 1994, 8775, 1777, 6227, 7399, 8035, 4537, 27, 9947, 3949, 7985, 5273, 6245, 1725, 4833, 5487, 3485, 5313, 6345, 4447, 6653, 5145, 2293, 8595, 2731, 1295, 4907, 1801, 5387, 7097, 1339, 8327, 7199, 8957, 6089, 2789, 6903, 9337, 5563, 9117, 3127, 945, 5185, 4165, 2817, 3179, 9133, 3925, 5161, 8159, 1917, 8267}, {3672, 3306, 4102, 9666, 4942, 1286, 4856, 9328, 9016, 3146, 8292, 1864, 4630, 7760, 3276, 238, 508, 826, 5510, 9742, 9006, 1232, 9090, 3634, 6516, 8332, 1792, 540, 4571, 7927, 7397, 3801, 4267, 4723, 4563, 1549, 3697, 2351, 2579, 4009, 3549, 2633, 229, 3049, 1461, 1613, 4261, 5549, 8799, 2765, 1081, 3317, 4515, 4757, 7535, 6471, 5375, 1243, 1967, 9545, 2597, 5737, 5761, 541, 11, 1419, 3723}, {5338, 7090, 7852, 7978, 4334, 8310, 7106, 9236, 5798, 8794, 9146, 6928, 8112, 4660, 3562, 8056, 1280, 2498, 8640, 5490, 6030, 6396, 1718, 6504, 1814, 1186, 1774, 8754, 1362, 6164, 1788, 6194, 3098, 7986, 8697, 1647, 5177, 9653, 7141, 417, 8979, 8119, 6709, 1845, 6615, 8381, 8955, 6255, 9285, 2095, 7957, 4631, 2227, 9769, 35, 5691, 5519, 4619, 3065, 1147, 3789, 2827, 2343, 5789, 7979, 5683, 9337, 747}, {9558, 9742, 9138, 3566, 8774, 622, 8316, 6632, 1602, 4722, 7734, 3722, 9502, 2254, 5704, 3154, 3936, 1518, 3882, 3956, 432, 7638, 194, 1804, 5100, 9466, 6344, 9807, 6921, 3427, 5183, 7589, 2321, 7201, 2275, 8053, 1873, 4261, 7071, 2441, 8625, 155, 2711, 237, 5203, 1459, 8939, 7017, 4521, 1945, 6427, 3735}, {8536, 8580, 6306, 8970, 5088, 4734, 7082, 5402, 1204, 9142, 2194, 5944, 4402, 3866, 5254, 7716, 768, 7734, 4136, 9984, 9746, 9786, 1802, 3152, 6570, 2174, 5278, 3958, 4360, 5606, 6331, 8059, 8945, 6445, 9713, 635, 4247, 3473, 7077, 7043, 4057, 8765, 1119, 4687, 4331, 9701, 8375, 5749, 9569, 935}, {2646, 124, 2058, 6526, 7154, 6774, 5364, 7336, 8626, 5962, 4224, 960, 9512, 2176, 6428, 8420, 6968, 5304, 8758, 3446, 8814, 9396, 2362, 1592, 1046, 912, 1860, 7900, 3472, 648, 5272, 5474, 242, 3636, 3720, 9042, 6410, 5653, 6075, 45, 2005, 8349, 9247, 7259, 2937, 747, 1453, 6741, 5549, 7695, 3011, 639, 6719, 4479, 4483, 9075, 9203, 1561, 2719, 2791, 2241, 4115, 7847, 5401, 3177, 7237, 3691, 7921, 3973, 7383, 1009, 7755, 7329, 6561}, {1930, 4910, 8128, 1534, 120, 9534, 6988, 5488, 3240, 3520, 2504, 540, 2090, 870, 4660, 4704, 3196, 8978, 1138, 7612, 7986, 656, 5736, 4156, 6918, 9218, 4905, 9037, 9555, 5213, 73, 1707, 2583, 825, 6149, 9485, 8143, 7749, 7579, 3149, 4539, 1593, 4297, 2381, 6569, 7251, 3067, 8249, 5577, 5075, 409, 3029, 4301, 985, 6283, 9457, 3383, 7069, 9345, 9997}, {1576, 6816, 646, 296, 1758, 6184, 9830, 6390, 2792, 10000, 9908, 8810, 4430, 9420, 4904, 3986, 1542, 5498, 564, 1300, 1374, 4138, 816, 7358, 3650, 210, 2756, 2934, 5864, 7227, 8689, 2913, 7781, 6867, 9293, 3251, 7515, 5447, 1529, 3907, 1997, 3397, 8439, 9165, 1265, 1735, 9339, 857, 9797, 8769, 7489, 6539, 2097, 9749, 5819, 693, 3245, 5825, 5907, 6237, 205, 8357}, {2926, 2264, 8550, 4226, 9414, 3524, 3348, 8002, 9590, 8286, 8766, 6800, 7670, 9726, 836, 5606, 4954, 9174, 236, 5036, 9823, 1247, 5753, 7515, 4173, 6691, 2235, 7815, 6055, 4393, 8441, 4263, 405, 2595, 5487, 9893, 4601, 6185, 6187, 7153, 3017, 7307, 9375, 7335, 7463, 8453, 7069, 219, 9549, 7925, 5029}, {2642, 3238, 4790, 9180, 2282, 1056, 7700, 8020, 7172, 3894, 400, 896, 6008, 8690, 1226, 8160, 1368, 2962, 9948, 5906, 5748, 6752, 5252, 2502, 642, 776, 9436, 5278, 5786, 1672, 8152, 4872, 848, 4030, 6332, 760, 1692, 314, 4964, 9286, 1668, 9054, 2030, 7092, 6998, 119, 8461, 781, 3121, 4147, 8691, 8181, 1895, 2955, 3355, 7369, 2441, 7755, 3065, 5155, 4669, 9373, 4135, 4805, 3589, 4529, 6345, 5163, 5379, 3629, 4383, 6721, 729, 2261, 5787, 2155, 8061, 245, 149, 8505, 1829, 3719, 1197, 9101}, {2650, 3914, 1894, 4600, 3316, 9884, 1366, 6654, 1362, 9038, 6408, 8828, 5156, 4926, 5900, 6578, 1480, 7192, 4146, 4044, 554, 7478, 7958, 4892, 5516, 6524, 5896, 8100, 3214, 4768, 90, 2902, 9814, 7534, 1528, 3062, 9730, 9274, 9675, 1145, 3743, 2503, 7307, 2599, 3999, 7285, 79, 8237, 5983, 5097, 5663, 5759, 7061, 9083, 955, 8919, 9945, 7321, 9229, 303, 6851, 8531, 3913, 3357, 2993, 2153, 709, 5165, 6723, 5295, 1301, 3165, 6323, 5053}, {5196, 6168, 6450, 6616, 1568, 6974, 72, 7784, 3478, 2836, 8426, 5668, 4584, 3020, 7686, 7740, 9404, 6392, 6574, 8898, 6234, 6548, 8722, 4202, 1588, 8660, 9488, 7506, 1688, 296, 1830, 1038, 984, 6054, 3454, 4432, 2940, 374, 6462, 8572, 4904, 4538, 9192, 9274, 5818, 6591, 7677, 4171, 5981, 5103, 4083, 1959, 1853, 7239, 2071, 2817, 7469, 4457, 4851, 7775, 9769, 1363, 4747, 7349, 1683, 2151, 8457, 5151, 6787, 1395, 4793, 9387, 3529, 33, 6023, 8307, 4963, 1043, 5699, 2239, 1763, 6997, 3931, 8577, 5425, 5615, 9481, 7863, 2333, 3715, 7297, 8697, 3785, 2545, 2133, 1513}, {5304, 6690, 2360, 6486, 388, 9570, 9758, 2924, 668, 7838, 2444, 4094, 8896, 2070, 9690, 5200, 126, 9074, 610, 9866, 1506, 8658, 6384, 2334, 806, 9388, 3736, 9006, 2338, 4996, 5386, 812, 3778, 8387, 1639, 6933, 2817, 7037, 1471, 4685, 6503, 6955, 3209, 4077, 5925, 6757, 5009, 9201, 1687, 9549, 8409, 5437, 8707, 4561, 8165, 3669, 6691}, {9242, 5192, 6328, 6224, 2246, 7096, 3748, 7352, 4518, 1610, 8768, 2180, 214, 8260, 8236, 2250, 4698, 5874, 934, 2760, 3054, 7790, 6060, 5148, 840, 2344, 5750, 3640, 2574, 7736, 8364, 1556, 3904, 1750, 7598, 4522, 638, 1930, 3912, 863, 1555, 4719, 311, 4783, 7949, 3021, 2913, 8419, 8807, 1509, 4257, 3035, 7077, 7541, 7057, 4837, 1921, 5561, 7949, 8429, 7559, 413, 3079, 477, 3817, 649, 259, 3589, 5447, 821, 9553, 949, 9859, 607, 2913, 5243, 5609, 553, 6407, 9587, 1093, 1059, 1119}, {9636, 4518, 2240, 3766, 2074, 2322, 7178, 7338, 7834, 1632, 5306, 9654, 1974, 9760, 6462, 2080, 5214, 5222, 134, 2892, 768, 764, 2662, 7092, 270, 8800, 9602, 3026, 8006, 395, 89, 5721, 4499, 3055, 5203, 8115, 3999, 3695, 7631, 3253, 9139, 8513, 3485, 1293, 5233, 6455, 5515, 4157, 1845, 589, 6579, 1723, 6427, 1423, 2399, 5585, 3795, 4347, 6893, 7939, 6625, 9797, 5009, 6439, 5477, 347}, {8034, 4072, 2154, 8496, 1934, 6318, 8228, 1186, 5178, 946, 4292, 154, 2554, 1414, 5808, 5046, 8818, 3380, 1588, 7360, 8032, 5662, 7834, 6168, 1738, 4336, 1472, 9124, 8136, 9610, 4680, 8322, 9214, 762, 7484, 5178, 4578, 4104, 6856, 6784, 8490, 2340, 2632, 6460, 502, 9654, 9154, 8500, 4860, 6196, 4318, 4206, 2, 6836, 9659, 9917, 5591, 6687, 5741, 473, 8061, 1727, 7837, 8087, 9487, 5583, 1669, 6041, 2819, 5847, 3529, 3279, 2965, 4927, 7407, 4405, 3843, 5195, 7173, 7617, 4515, 631, 9407, 5217, 7365, 745, 4703, 2969, 8109, 9235, 5871, 5613, 1195, 9967, 6411, 3281, 4731, 9943, 133}};
		public static boolean test(int i) {
      if(!common.test_anagram(in_0[i], in_org_0[i])) return false;
		  boolean flag = false;
		  for(int j = 0; j < in_0[i].length; ++j) {
        	if (in_0[i][j] % 2 == 0) {
					  if(flag) return false;
				  } else {
					  flag = true;
				  }
			}
      return true;
    }
}
