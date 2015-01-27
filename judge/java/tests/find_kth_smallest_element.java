package tests;
import java.util.*;
import java.lang.*;
import java.io.*;

public class find_kth_smallest_element {
    public static int num_test = 60;
    public static int[][] in_0 = {{10, 5, 12, 16, 12, 12, 10, 2, 12, 4, 16, 1, 3, 10, 17, 5, 16, 18}, {19, 16, 7, 16, 15, 18, 13, 5, 16, 3, 17, 14, 6, 14, 4, 10, 10}, {12, 11, 0, 9, 9, 1}, {15, 16, 3, 0, 5, 10, 8, 17, 16, 1, 13, 5, 1, 18, 11, 2, 5, 9}, {8, 16, 2, 13, 16, 4, 11, 16, 11, 16, 0, 13, 1, 15, 4, 6}, {9, 18, 9, 15, 13, 15, 17, 1, 7, 16, 1, 10, 6, 8}, {8, 7, 18, 11, 3, 6, 0, 5, 13, 16, 7, 16, 8, 5}, {14, 15, 7, 7, 0, 9, 2, 19, 1, 2, 12, 12, 1, 1, 0, 14, 11, 2, 3, 0}, {7, 8, 15, 18, 16, 14, 2, 4, 8, 2, 10, 18, 12, 1, 13, 12, 6, 19, 2}, {8, 15, 11, 17, 8, 15, 1, 12, 17, 11, 4, 11, 3, 19, 14, 9, 7, 13, 6, 11}, {-82, 35, -57, 32, 11, 16, 54, 76, -51, 13, -60, -69, 17, 69, 36, -80, -42, 56, -94, -87, 45, 58, -25, 93, -85, 53, -32, -69, 33, 84, 54, 75, 44, -93, 10, -54, 78, 14, 87, -24, -78, 74, 68, -9, 38, 81, -75, -11, -12, 22, 94, -56, 94, 72, -31, -46, -21, 18, -9, 39, 43, -35, 72, -9, -26, 6, -97, -57, -81, -75}, {-83, -52, -72, -50, 4, 52, 85, 53, 57, 72, 66, 82, 8, 92, -45, 39, -38, 21, 53, -55, -10, 52, 93, -78, 87, -30, 62, -83, -79, 21, -35, -75, 50, 30, 78, -76, -79, 33, 36, 32, 24, -16, -1, 100, 13, -33, 36, -84, 79, 65, -95, 1, -75, -7, -8, -54, -58, 67, -50, -70, -10, 97, 48, 54, 10, 80, 77, -92, 97, 34, 95, 12, -95, 61, 84, -64}, {5, -7, -30, -66, 84, 6, 66, -65, 31, -1, 4, 9, -100, -35, -64, 74, -16, -42, -86, 90, 41, -32, 100, -47, -44, -49, 51, -18, -56, -5, -65, -41, 100, 67, -22, 38, -5, 18, -28, -45, 33, 4, 56, -77, -81, -72, -60, 31, 49, -92, 57, 25, 25, -20, -41, -80, -16, -71, -78, 90, 86, -7, -42, 16, 23, 99, -94, 62, 95, 14}, {39, -24, -69, 62, 70, -53, 96, -37, -28, 63, -100, 14, -30, 70, 51, -24, 51, 41, 5, 17, 64, 62, -94, -10, 80, 5, 93, 56, -28, -21, -91, 23, -14, 92, -67, -8, -41, 69, -32, -38, -58, 80, -99, -74, 87, -73, 38, -50, 1, -10, 73, -5, -95, -61, 0, -11, -65, -17, 66}, {42, -89, -52, 77, 57, 41, 29, 21, 43, 82, 72, -5, -20, 53, -14, -10, 100, 43, -50, -37, 10, -16, -71, 19, -46, -77, -48, -5, -88, -28, 26, -78, -37, -75, 83, -68, 43, -16, 55, -42, 76, 92, 93, 27, -67, -24, -59, -72, -58, 100, -52, -68, 56, -95, 13, -19, -36, 64, -81, -78}, {-54, -92, 33, -42, 98, 41, -86, 56, -4, -71, 11, 63, 84, 9, 31, 100, -94, 81, 46, 83, -5, 10, 62, 66, -36, -67, 91, 61, 62, 92, -42, -76, 4, 6, -49, -79, -75, -25, -38, 32, -14, -32, -64, 42, 89, -95, -39, 5, 98, -59, -71, -20, -59, -41, 89, 17, -35, -71, 66, 0, -75, 5, 58, 25, -91, 73, -37, 93, 53, -63, -40, -42, 26, 8, -36, 89}, {-31, -5, 60, 11, 62, 78, 80, -56, 28, -44, 16, 42, 96, 46, -78, 29, 66, 53, -96, 6, -72, -75, -51, 9, -88, 78, 73, -44, 5, 75, -37, -92, 84, -47, -49, 60, -19, -94, 32, 71, 22, -16, -60, -16, 8, 71, 86, 9, 90, 82, -71, 72}, {-21, 13, 49, 7, 2, 71, 34, 75, -89, -37, -98, 95, -94, -86, 21, 37, -48, -33, 62, -33, 39, -27, -54, -55, 86, 26, 94, -46, 75, -7, 50, 39, 39, -88, 86, 13, 90, 22, -61, 14, 26, -27, 68, 70, 91, -19, 81, -25, -18, -13, -32, 56, -87, 69, -35, -3, -3, 77, 2, 60, -84, 27, -54, -31, 80, 41, -65, 28, -93, 77, -54, 75, 98, -88, -16, -60, 86, 94}, {-73, 20, 72, 18, 62, -31, -58, -53, 6, 91, 52, -97, -18, 7, -78, 1, -92, 2, 12, 14, -76, -5, 89, 22, -29, 0, 90, 36, -2, 12, 1, 27, -24, 9, 88, -36, 10, 9, 1, 89, -38, -4, 38, -61, 10, 1, 96, 0, -17, -10, -53, 91, 95, 94, -42, 97, 82, -43, -43, 53, -81, 41, 45, -21, -20, -90, 5, -15, 74, 70, 23, -68, 65, -68, -62, 25, 93, -17, 25, 31, -8, -51, 13, 42, -27, 65, -71, -96, -73, 12, 79, 25, -67}, {-100, 83, -40, 35, 78, 7, -99, -65, -23, 51, -92, 0, -26, -37, -75, 43, 16, 52, -17, 71, -75, -53, 55, 41, -71, 77, 35, -32, 7, -8, 51, -82, 10, -87, 78, -62, 92, 95, 56, -53, -87, 67, -62, -1, 94, -13, 5, 79, -77, 33, -18, 23, 76, -56, -27, -20, 14, -15, -69, -94, 65, -4, 12, 69, -67, 4, -8, -8, -55, -60, -23, -54, -55, -46, 56}, {-65, 78, -14, -81, -96, 44, 29, -26, 3, 31, -74, 37, -12, 88, 12, -44, -29, 8, 90, 16, -83, -100, -17, -85, -13, -24, -7, 0, -98, 78, 50, -82, 3, 44, -32, -92, 18, 77, 31, 14, -33, 64, 94, 53, 60, -31, 82, 42, 6, -25, -54, 88, -65, -88, 83, -82, -39, 6, -25, -56, -1, 2, -84, -45, 68, 86, -26, 82, 57, 5, -7, 60, 100, 29, 75, -6, 91, -40, -22, -60, -69, 86, -2, -45, -23}, {61, 95, 92, -61, 40, -37, 69, 15, -70, -79, 52, -17, -38, 71, 57, 5, -45, 26, -28, -62, -81, 28, 58, -13, 44, 41, 55, 26, 1, -82, -4, -20, 83, 43, -25, -100, 14, -75, -5, -61, -56, -46, 80, -9, 76, 14, 49, -58, 18, 81, 46, -11, -13, -76, -57, 37, -85, -9, -84, 27, 31, 93, 5, -28, -81, -2}, {-21, 83, 24, 52, 22, 95, 53, 4, -82, 55, 3, 40, -45, -19, -24, 11, -100, -25, -95, -31, -44, -70, 28, -59, 95, -58, 92, 46, 32, 100, -68, 41, 98, -99, -82, -63, -7, -79, -41, -59, 14, -86, 94, -14, 59, -72, -61, -64, -57, 16, 99, -66, 36, -30, -28, 42, 75, -12, 42, -92, 3, 85, 28, 61, 88, -32, -56, 26, -97, 16, 5, 24, -88, 76, -96, 87, -53, -27, 17, -63, -15}, {71, 2, -44, 58, -90, -73, 59, 84, 88, 62, 20, -50, -32, -6, 63, 74, 28, 12, 75, -78, 72, 59, 66, 96, -29, -8, 79, 2, 82, 22, 17, -69, 40, 44, -79, 73, -37, -29, 7, 36, -44, 62, -79, -25, -38, -3, 57, 90, 58, 59, -100, 65, 85, -87, -53, -94, 26, -80, 65, -82, -38, -53, -18, -65, 4, 82, -99, 50, -29, -2, -49, 67, -6, 26, 17, 97, 75, -7, -27, 0, -75, 59, -96, -37, 30, -21, -12}, {92, 77, 57, 57, 53, 81, -51, -23, 47, -44, 63, 97, -3, -66, -61, -6, 44, -53, -98, 89, -66, 66, -82, -55, -58, 11, -83, 88, -82, 42, -76, -7, 8, -70, -54, -23, 51, -31, 69, -51, -78, 57, -30, -46, -19, 34, -27, 36, -59, 54, -61, 39, 57, 24, -16, -97, 90, -28, 37, -19, 37, -80, 71, 75, -88, 60, 25, -24, -42, -6, -57, -86, -35, -62, 4, 89, 98, -86, -67, 73, -50, -87, -36, 74, -100, 37, 2}, {97, -30, -1, -28, -1, 26, -50, 22, -3, -24, 28, -88, 97, 94, -43, 89, -66, 33, 20, -97, -14, 97, -25, 82, -68, 81, 89, -63, 58, 81, -89, -61, 11, 25, 24, 63, 68, 71, -35, -48, 12, 30, -88, -73, 7, -83, 45, 27, 89, -22, -13, 14, 50, 49, 67, 6, -40, -47, 37, -57, -65, -36, -80, -19, -10, 49, -30, -61, -29, -82, 10, 90, 77, 68, 28, -25, 27, 71, -53, 10, -60, 29, 49, 33, -58}, {-23, 30, -36, -52, 21, -60, 66, 21, -7, 18, 6, 23, -20, 40, 47, -61, -56, -25, 0, -14, -94, 81, 76, -19, -39, 60, -47, 24, -71, 12, 22, 8, -75, -52, 13, -90, -95, -84, -58, -69, 86, 93, 70, -33, 66, -42, 35, -43, -26, -72, 63, 25, -54, -17, 3, -7, 54, -3, 76, 2, -61, 92, 37, 45, 92, 58, 52, 19, -44, 67, 22, -74, 41, -34}, {-96, 59, -3, -62, 81, 70, -96, -4, 28, -24, 49, -86, 32, -66, -32, -8, 54, -4, -27, 58, -66, -64, -73, 61, 39, 64, -92, -69, -87, -98, 75, -83, 33, -88, 38, 4, -67, -63, -44, 52, -28, -78, 90, -40, -13, 68, 88, -56, -36, 9, 71, -79, 72, 28, 45, 52, 1, -66, 78, -68, -76, 58, 72, 54, 9, 50, 46, 65, 12, -28, -63, -7, -17, 14, 39, 63, 54, -46, -37, 64, -69, 16, 34, 68, -53, -77}, {-89, -78, 89, 39, 90, -71, -44, 61, 97, -31, 55, -23, -89, 5, -95, -54, 22, -25, 24, 73, 12, 33, 29, -20, 66, -65, 3, 54, 32, -82, -66, -98, 83, 93, 82, 85, -82, -83, 36, 61, -48, 82, -3, 82, -87, -74, -61, -44, -18, 36, -81}, {-98, -63, -56, 38, -88, -46, 58, -33, -68, 88, 61, 78, 52, -8, 33, -73, 61, 12, 36, 66, 92, 18, 92, -29, 37, -67, -32, -93, 18, -49, 91, 9, 39, 42, 31, -9, 3, 25, -2, -91, -51, -55, 96, -80, 76, -51, 54, 42, -22, 60, 95, 78, 85, -53, 90, 80, 27, 10, -5, 63, 100, 37, -15, 77, -74, -45, -80, -20}, {278, 330, -225, 95, 322, 21, -46, -387, 474, 50, -277, -237, 430, -428, 411, 326, 79, -465, 119, 494, 449, -392, -48, 282, 130, 285, -195, -133, -18, 342, 69, -119, 464, -308, -111, 350, -498, 60, 371, 392, -260, -373, -98, -346, 52, -278, -420, -483, 205, -199, 204, -305, -59, 446, -210, 354, 5, 297, -203, 215, 18, 384, -204, -353, 185, 240, 16, 19, 444, -218, -488, -291, -355, 262, 476, -204, -150, 15, -487, 103, 443, 492, 476, -319, -401, 295, 20, 26, 493, 164, -259, 445, -464, -76, 114, 392, -369, -45, -130, 308, 487, -6, 203, 9, 491, 220, 363, -231, -451, 291, -51, -84, -150, -215, 185, -158, -289, -276, 135, 374, 449, 123}, {-499, 99, -358, 455, -236, 107, 354, -275, -301, -278, -324, 1, -321, -167, 285, -157, -330, 201, 238, 230, -215, 361, 258, 264, -48, 333, 243, -408, -215, 38, -174, -262, -215, -358, 10, 274, 345, -341, -116, 13, -30, 171, -468, -413, 288, 282, 124, 290, -401, 2, -218, -457, 22, 376, -412, -30, 429, -471, 75, 303, -472, 149, 373, -165, 41, -364, -150, -346, 203, -60, 139, 401, -38, 127, 161, -443, 329, -437, 217, -131, 25, -379, 476, 12, 323, 5, -216, 192, 427, 135, 202, 248, 90, 345, 422, -223, -195, -77, -35, -254, 424, 80, 459, 106, 404, 283, -243, -46, -380, -454, -313, 137, -454, 459, -174, 203, 470, -281, 217, -203, 301, -361, -360, -427}, {-169, -192, 327, -345, 159, -213, 287, 38, -301, -477, -257, 75, -369, 280, 382, 362, 356, 343, -393, -139, -375, 156, 108, 355, -429, -444, 446, 233, -324, -15, 312, -439, -242, 499, 394, 257, -404, -47, 73, 69, 179, -68, -443, 183, 362, -404, 151, 453, -168, -300, -235, 228, 101, 301, -477, -124, 238, 290, -424, -55, 113, -390, -312, 2, -42, -41, -339, -306, 167, 276, -354, -78, -137, -54, 398, -342, -376, 135, -152, -363, -198, -337, -490, 239, 463, -362, 461, 189, -36, 308, 425, 250, 163, -76, -116, 446, 176, 431, 310, 245, 185, 68, -398, -6, -13, 359, -354, 476, 288, -260, 161, -75, -135, 66, -419, 436, -22, -54, 473, 3, -342, -438, 51, -341, 279, -276, 61, -392, -497, -411, -481, -99, -328, -421, 208, 68, 315, 275, 275, -449, -408, -27, -268, -250, 40, -179, 253, -332, 162, 106, -67, -487, 386, 298, 85, 126, 462, 174, -119, 410, 132, -2, -299, -453, 493, -237, 359, 295, -196, -278, 246, 268, 481}, {111, -163, -301, 120, 378, -401, 308, 93, -151, -369, 32, 401, 84, 322, 200, -259, 451, -81, 139, 289, -253, 343, -210, 390, 325, -242, -232, 145, -447, 291, -22, 73, -4, 64, 205, 172, 352, 300, -430, 385, 422, 389, 246, 63, -295, 156, 241, -174, 432, 24, -457, -277, -69, -102, -395, -310, -416, -96, -306, -202, -465, -75, 218, -8, -243, 201, 448, -260, 371, -30, -265, -275, 176, 39, -478, -53, 373, -110, 435, -346, -435, 367, -177, -160, 226, 31, 385, -43, -201, -301, -158, 460, -479, 491, -66, 108, -376, -3, -208, -36, -262, 122, 140, 43, 257, 402, -313, 6, -213, 338, -171, -246, -297, -225, -227, 378, 424, -151, 192, 212, -281, 359, 285, -293, -98, 33, 265, 312, 1, 405, -118, 302, -238, -64, -267, 414, -376, -35, -410, -174, 240, -377, 349, -125, -341, 88, -144, -459, -90, -4, 407, -239, 476, -70, -322, 380, 376, -340, 276, -303, -58, 482, 298, -249, 278, -260, -68, -73, 153, 162, 99, 411, 315, 178, -369, 156, -327, 332, -20, -125, 88, -233, -284, -319, 412, 121, -295, -112, 96, -84, -215, -386, -364, 17, -470, 264, 326, -213}, {-77, -140, -127, -470, -445, -403, -122, 388, -46, -91, -290, 398, 438, 493, -252, -30, 182, 181, 337, -341, 8, -172, -241, 499, 322, -497, 408, -105, 34, -274, 436, -78, -63, 108, 345, 34, -199, 4, -369, -65, 322, -479, 236, 134, 185, -20, 132, 115, -115, -187, 298, 117, -485, -389, 72, -370, -70, 148, 418, -221, -215, 346, 272, 462, -392, 309, 186, -47, 448, 341, 356, -299, 60, -76, 429, -407, -246, -129, 295, 109, -373, 17, 230, -379, 55, 119, 446, -463, -10, 197, -244, -39, -29, 464, 311, -38, -313, -382, -462, 247, -497, 193}, {421, 123, -424, -422, -308, -193, 201, 124, -178, -488, 301, -420, 485, 286, 332, -224, 5, -462, -37, -478, 301, -352, 103, -108, -92, 316, -452, -409, 208, 59, 130, -93, 328, -86, -413, 141, -326, -273, 64, 75, 340, 396, 356, -475, 405, -355, -411, 244, -476, -90, -133, -263, -227, 95, -315, 9, 387, 391, -183, 239, -383, 449, -55, -112, -23, 300, -326, 297, 303, -494, 287, -161, 22, -389, -397, -149, -105, 375, 419, 371, 369, 38, -124, 132, -455, 256, -83, 286, 229, -178, -236, 185, 56, 490, -20, -240, 290, -274, -133, 361, -186, 8, -329, 500, -32, -115, 75, 21, -146, -354, 201, -471, 441, 488, 257, -179, -74, -211, -98, -158, -457, -445, -161, 91, -153, -337, -106, -30, -391, -76, 138, -318, 391, 226, -395, 1, 168, -90, -492, 107, 456, -128, 3, -357, -104, 284, 191, 202, -9, 308, -9, -294, -474, -56, -20, -385, 94, 88, 236, -375, -269, 5, 302, -346, 271, 346, -45, -374, 369, 361, -87, 342, 306, 211, -277, -355, -461, 500}, {-217, 154, 443, 129, -154, -490, 35, 97, 44, -423, -288, -135, 95, 189, 305, -385, 79, 235, -320, -28, -18, -256, -165, -167, -37, -305, 284, -332, 188, 111, -103, -78, 457, 81, -135, -437, -302, 372, 165, -90, 182, -18, -289, 380, -476, -197, -26, -265, -403, -373, -428, 64, -407, -62, -259, 66, -266, -286, -43, 86, 345, -26, -99, 39, -479, 253, -163, -114, 198, -39, 372, -245, 30, -223, 302, -63, 31, 90, -111, 310, 440, -127, -85, -458, -382, -83, -381, 369, 111, 118, -146, -240, -191, 408, 433, -71, -354, -31, 77, 25, 189, 91, 28, -220, 296, -118, -63, 317, 277, 446, -185, -86, 86, 442, 493, -131, -248, 116, 168, -199, -385, 296, 147, 22, 288, 110, 326, -489, 138, -433, -436, 441, 15, -418, -318, 8, -34, 10, -430, -106, 415, 353, 454, 220, -89, -188, 64, 490, -124, -205, -219, 39, 270, -95, 252, 77, -356, 231, -268, 207, -212, -64, 362, -118, -456, -222, 135, -320, 297, -242, 235, -90, 156, -99, -61, 113, -381}, {-34, 398, 269, -255, 288, 439, 206, -327, -138, 346, -59, 467, 23, -69, -486, -175, -134, -408, -443, 72, -145, -421, 51, 122, -298, -333, -247, 254, 453, 496, 160, -341, 101, 452, 305, 336, 287, -73, -486, -160, -113, 420, -235, -324, 372, 356, 276, 107, 238, 75, 208, -91, 23, -111, -374, 375, 321, -249, -138, -376, -121, 316, 426, 21, -307, 488, 407, -249, -471, 268, 425, 85, -176, -497, -393, 281, -78, -336, -255, -464, 404, 75, 333, -223, -153, 170, 19, -78, -143, 423, -364, -373, -254, -481, 182, 427, 246, 488, -286, 460, 355, -222, 410, -232, -87, -291, 224, 401, -469, -11, 221, -300}, {136, 467, 442, 458, -80, 331, 302, -457, 316, 175, -342, -141, -436, 361, 392, 41, 93, 400, 61, 322, 275, -466, 26, -291, 295, -1, -72, -135, 127, -287, 317, 304, 163, 283, 107, 107, -435, 408, 192, 80, -428, -492, -459, 179, 184, 416, 426, -375, -237, -67, -459, 356, -238, 10, -444, 371, 226, -397, 353, 75, 135, -497, -315, 271, -453, 396, -288, -371, -302, -129, 466, 254, -44, 381, 364, -450, -162, 113, 334, -218, 176, 17, -90, 231, -426, -481, -494, -138, -172, 499, -485, -22, -146, 359, -131, 188, 232, 407, -245, -240, 172, 455, 365, -228, 116, 215, 452, -371, -481, 214, 423, 134, 419, 309, 113, 495, -439, -265, -370, -227, -407, -349, 387, 27, -185, 1, 145, 164, -23, -179, -48, -355, -476, 315, 498, 322, -455, -368, 306, -309, -199, 298, -105, 430, 90, -237, 63, 497, 189, 171, 182, -249, 136, 269, 263, 351, 41, -91, 114, 493, 431, -236}, {-285, 477, 421, 473, -427, -194, -474, 277, -280, -1, -267, 107, 375, -327, -327, 51, 121, -365, -491, -281, 234, -15, -151, -213, 325, 282, -362, 332, 73, -291, 426, -24, 166, -27, -351, -161, 329, 247, -443, 470, -103, -357, -467, -76, -96, -248, 449, -245, -52, -425, 309, 99, -80, -391, -420, -414, -125, 352, 318, 245, -232, -403, 264, -80, 126, -155, -463, 100, 446, -370, -287, 186, -77, -116, -151, -32, -330, 61, -155, -114, -323, -326, 355, 251, -208, -10, -217, 407, -41, 249, -223, 402, 203, 462, 305, 213, 499, -484, 268, 238, -405, -19, -24, 67, 372, -231, 281, 377, -177, 381, 3, -356, -332, 305, -192, 189, 213, 313, 307, 326, -338, -324, 281, 203, -276, 261, -149, 247, 282, 210, -429, -94, 300, 450, 353, -255, 392, 83, -10, 80, -281, -220, -204, 360, -66, 390, 139}, {454, -414, -51, -84, -341, -83, -425, -425, 289, -248, -167, 384, 459, -159, 224, 235, 434, -136, -25, -234, -2, -102, -35, -12, -366, -230, -353, 139, -21, 303, 450, -492, 296, 222, 240, -488, 439, 243, -383, -94, -257, -227, -105, -396, 374, -290, 329, -31, 183, -148, -138, 492, -461, -280, -139, 60, -99, 480, 270, 93, -317, 154, -8, -235, 304, -417, -309, 342, -203, 335, 14, -378, -308, 102, 220, -199, 130, 188, 318, -186, 125, -386, 305, 23, -379, -449, -432, -63, 433, -335, 39, 50, 34, 294, 329, 327, 291, 287, 487, -464, 23, 460, 175, 292, -192, 430, -458, 13, -306, 264, -428, 263, -196, -367, -267, 323, -32, 178, 54, -206, -185, 405, -270, 414, 245, -236, 216}, {207, 471, 403, -390, 350, 234, 134, 53, -397, 450, 25, 178, -79, 229, 453, -496, -286, -261, -218, -422, -47, 270, -183, -399, -226, -216, 45, 281, 341, -88, 143, -448, 216, 284, -113, 1, 219, 189, 349, -219, 132, -73, 346, 158, -449, 211, -231, -239, 90, 51, 427, -124, -466, -159, 445, -8, 238, 316, 82, -204, 117, 306, 28, 158, -479, -163, 402, -41, 362, 305, 419, -75, -76, 363, -119, -309, -255, -314, 308, -40, 310, 67, -179, 29, 133, -192, -388, -11, -352, 290, 386, -232, 21, 174, 419, 407, -7, -213, 40, -10, 204, 366, 409, -440, -230, 330, -170, 278, -50, -416, -228, 485, 462, 365, -387, -327, 264, 471, -230, 132, -393, 475, -194, 140, -7, 212, 270, -433, 56, -39, 36, 223, 226, -34}, {275, 90, -232, 475, -389, -167, 257, -191, -497, -232, -326, -85, -196, -87, 411, 38, -423, 473, -418, 119, -450, -144, -469, -161, -434, 192, 311, -189, 61, 315, 174, 41, 291, -286, 263, 11, -324, 306, 88, 302, -298, -248, -462, 306, -59, 302, 65, -54, 176, 201, 313, 165, 479, -26, 188, -137, -191, -240, 180, 225, 394, -29, 329, 484, -359, 386, 204, 238, -93, -114, -191, -283, 270, 150, 315, 106, -75, -45, -283, 282, -347, -319, 33, 61, 463, 301, -369, -359, 413, 185, 352, 101, 38, -294, 323, -268, -289, 158, -291, -19, -81, -141, -410, 197, 100, -416, -424, -54, 21, -243, -288, -190, 251, -301, 19, -243, 258, 487, 86, 249, 404, 146, -85, -139, 78, -440, 468, 406, -277, -77, 56, -148, -197, -390, 354, 240, 82, -94, 114, 259, -22, -304, 374, -86, -125, 373, 40, -152, -42, -354, -23, 229, 92, -451, 88, -209, 265, -459, 443, -28, 287, -296, -366, 57, -335, -294, -184, -5, 57, -474, 102, 96, -388, -26, 392, 489, 324, 319, 383, 372, 115, -69, 165, -440, 149, 14, -458, 82, -147, -224, 122, 320, -20, 268, -362, -196, -339, -367, -231, 5}, {-81, 481, -490, 467, 82, 258, 6, -430, 324, -9, 172, -282, 101, 250, -231, -126, -480, 60, 175, -71, 52, -280, 370, -90, 131, -365, -219, -182, 412, 419, 474, 348, 226, -33, -479, -84, -174, -52, -155, 241, 167, 30, -491, 80, -316, 372, 117, -409, -405, -331, -203, -116, -357, -151, 110, -445, -100, -171, 123, 316, 292, -479, 473, -400, 470, 322, 375, -408, 317, -253, 332, -443, 89, -361, 189, -10, -213, -467, -198, 19, -317, 63, 417, -352, -479, -362, -372, 490, -366, -153, 248, 342, -295, -80, 352, 87, -15, 60, 179, -478, -296, 226, 197, 350, 264, 105, 110, -260, -12, -233, 257, -41, -490, -323, 399, 113, -193, 374, 105, -429, 126, 349, 198, 304, -274, 304, -473, -155, -101, -259, -407}, {-122, -344, 457, 156, 424, -423, 301, -8, 387, -422, -421, 124, 97, 373, 230, -164, -275, -203, 247, -257, 444, 58, 186, 383, 374, 162, 394, 495, -235, 412, -73, -306, -238, -58, -104, -101, 52, -153, 317, 119, -96, -270, -414, 73, 414, -333, 111, 2, -416, -239, 105, 225, 315, -394, -451, 144, 353, -338, -193, 480, -422, 451, -112, -231, 341, -438, -122, 405, 306, -84, 217, -320, -236, -164, -442, 498, 203, 272, -302, 41, 177, 149, 27, -159, 470, -336, -96, 268, 128, 392, 255, -427, 23, -237, -296, 432, -405, -2, 221, 351, 100, -213, -358, -12, -297, -223, 43, 135, -97, -265, -455, -48, -93, 135, 220, 174, 255, -68, 298, 36, -343, 416, 482, 166, 219, -243, 385, 418, -315, 180, -123, 26, 22, -124, -269, -260, 285, 375, 278, -329, 23, 68, 64, 280, -455, -497, 181, -153, 423, 274, -323, -212, 293, 454, 372}, {280, -11, 273, -208, 251, -239, 264, -223, -306, 235, -233, 423, 161, -90, 353, -249, -97, -496, 421, -196, -473, -337, -321, -291, -344, 244, 118, 204, 411, 402, -109, -139, 156, 228, 256, -355, 438, -323, 411, 290, 347, -282, 189, -186, -416, -12, -52, -86, -76, 307, 498, -465, 12, 454, 226, -233, -336, 181, 61, -37, -139, 121, -433, 1, -243, 387, 469, -433, -96, 155, -15, 67, -32, -490, -283, 130, -418, -294, -337, 440, -155, -155, 473, 249, 212, 484, 199, 8, -204, -485, -70, 113, 116, -205, -114, 108, -199, -126, -433, -397, 455, -69, -44, 177, -192, -29, 16, -170, -43, 485, -324, -400, -401, -205, -360, 365, 236, -364, 296, -239, -301, 113}, {-156, -202, 220, -137, 78, 86, -197, 322, -311, 386, -320, -189, 195, 82, 276, 288, -313, 407, -317, 407, -430, -183, -451, 360, -323, -63, -466, 251, -67, -255, 385, -8, -163, 38, -459, 173, -471, 360, -92, 27, 278, -303, -138, 37, -170, -379, -17, 230, 450, 285, 295, 329, -382, 435, -356, -115, -344, -417, -274, 150, -245, -318, 450, 14, -125, 424, -358, 310, -34, -55, -209, 487, -150, -213, 139, 122, -376, -11, -59, 413, 308, -462, 481, 292, -71, 446, -192, 25, 403, 237, 321, -393, -176, -175, -469, 155, 485, 209, 67, 245, 218, 140, -14, -422, 283, -355, -495, -208, -283, 411, -167, 240, -60, -92, -99, -223, 65, 312, -16, -72, -450, 359, -330, 350, -355, 435, 203, 12, -420, -235, -396, 49, -2, -204, 423, -450, 0, 83, 91, 5, -452, -195, -51, 344, -169, -22, 334, -169, -365, 260, -86, 164, 72, 91, -486, 196, -317, 308, -40, 95, 375, 108, 125, -183, -473, -33, 250, -387, 447, -153, 497, 273, -453, 18, 488, -62}, {227, 109, 399, 197, -67, -487, 500, -481, 321, 331, -266, 219, 122, -487, -58, 340, -271, -62, 310, 36, 430, -442, 157, -253, 358, 2, 34, 401, -462, 320, 289, -363, 197, 23, -181, -47, 316, 48, 473, -200, -134, -55, -220, -134, -269, 395, -64, -6, -17, 292, -395, 169, -228, -164, 175, -145, 353, -289, 213, 75, 257, 332, 274, 388, 460, 125, 22, -152, 182, 382, -311, 450, -478, 128, -223, -121, -290, -182, 282, 152, 33, 187, -400, 321, 0, -2, -59, 404, 262, -21, 362, -250, -333, -460, -1, 74, 306, 120, 280, -359, -229, 202, 231, -269}, {-305, -368, 189, -87, -308, 369, -201, -234, 431, 164, -432, 309, -350, -446, -406, 428, 469, 204, 339, 33, 121, 79, 61, -472, -419, 431, 430, 223, 206, 84, 415, -196, -139, -228, 474, 63, -143, -201, 157, -486, -306, -177, 78, 314, -63, 108, 129, -5, -391, 98, -196, -27, 120, -447, 21, -131, -248, -309, -273, 476, 376, 213, 202, -264, -242, 434, -322, 435, -215, 148, -86, -20, 79, 30, -46, 473, -373, 498, -245, 90, 272, 299, 56, -99, 317, -255, 164, -154, -323, 26, -52, 175, 449, -164, -234, -293, -497, 376, 107, -178, -272, -421, 87, 129, -288, -145, -489, -159, 13, 182, -377, 138, -189, -462, -458, 77, -198, 77, -436, -197, 127, 3, -437, 370, 208, -21, -227, 200, 224, 175, 248, -400, -95, -294, -139, 5, 59, 456, -233, -443, 212, 343, 50, -330, -231, -224, 324, 3, -238, 292, -259, 11, -129, 181, -124, -360, -221, -346, 357, 38, -213, 155, 437, -246, 56}, {-237, -156, 393, -139, -134, 364, -28, -14, 334, -493, -213, -161, 274, -330, -63, -372, 432, 66, 482, -144, -8, -437, 124, -267, -440, -187, -278, -167, 91, 391, -103, 385, -440, 179, 304, -116, 170, 154, 239, -128, 33, -339, -378, 292, 341, -483, 134, 459, -5, 500, 347, 41, -185, 195, 462, -52, 119, 160, -183, -150, 117, -110, 13, 425, -347, -183, -224, -487, -72, -384, -80, 29, 161, 305, 326, -148, 342, -13, 434, -266, 399, 260, 227, -99, -128, -461, -245, 177, -404, 149, 91, 54, 393, 264, -465, 426, 238, 283, -396, -233, -352, -321, -282, 500, 381, -480}, {-10, 121, 243, -356, 90, 331, 38, -356, -1, 95, -138, -489, 439, -194, -395, -399, -128, 212, 392, -335, 376, -265, -9, -286, 286, -143, 310, -415, -48, -183, 176, 429, -140, 58, -448, 195, 190, -474, 171, 254, 353, -252, -144, -332, 458, 22, -219, 138, -373, 82, 13, -314, -7, 22, 213, -483, -59, 239, 435, 233, 205, 110, 215, 389, 279, -111, 414, -11, 403, 238, 249, -102, -302, 144, 327, -214, -201, 13, 408, -167, 340, -265, -99, -389, 1, -195, -411, -2, 429, -266, -74, 229, -289, -386, 286, -108, 163, -79, -1, 406, -124, 206, -250, 226, -377, 115, -258, 391, 118, -180, 498, -185, 70, 118, -137, -80, -396, 273, -258, -235, -392, -101, 61, -210, -317, -350, 141, -46, 154, -120, -407, -259, -255, -246, -245, -9, 135, 302, -319, -156, 138, -392, -284, -204, -238, 480, 492, -99, 189, 235, 192, -97, -289, 336, -112, -51, -396, 475}, {-194, -200, 10, -425, -127, -116, -128, -426, -310, 6, -157, -133, 129, -140, 473, 468, -64, 13, -287, 363, -23, 357, 352, -188, 272, 285, 46, 453, 417, 228, -295, -499, -141, -251, 294, 167, -361, -353, -30, 477, 48, -285, -90, 219, -149, 346, -497, 374, -310, 245, 280, 64, -360, -91, -443, 328, 348, 217, 374, 426, 190, -454, 388, 337, -483, -35, 429, 104, -178, 213, 12, 488, -205, -225, 466, 210, -150, -453, -31, 238, -127, 343, -449, -151, -316, -71, 277, -25, 91, -462, -29, 432, 116, 401, 458, -228, -402, 131, -231, -495, -160, 46, 267, -324, 97, -420, 52, -388, 273, -433, -252, -496, -280, -307, 137, 126, -242, -419, 38, -445, -109, 212, -406, 77, 231, 13, 94, -330, -235, -381, -453, 329, -245, -115, -127, 196, 124, 329, -376, -196, 110, -31, -293, -26, -52, 233, -45, -97, 125, 307, -326, 321, -427, 121, 480, -413, 291, -364, 304, 217, 473, -213, -70, -128, -76, 138, -326, 0, 348, -172, -315, 322, 181, -490, -483, 218, 142, 177, 446, -499, 153, 451, -265, 57, -371, 71, -272, 456, 353, -44}, {-248, 171, 12, 297, -192, -433, 392, -248, 470, -203, 5, -347, 296, 57, 32, 24, 151, -293, 120, 285, 141, -405, 295, 376, -237, 27, 75, -55, -178, -355, 381, -437, -487, 307, -269, -162, -65, -86, -38, -136, 377, -206, 280, 440, -419, 167, -230, 353, -74, -171, -174, 232, -143, 24, -40, 287, -325, 72, 43, -477, -101, -267, -366, 484, -372, 385, 398, 184, -248, 88, -99, -365, 388, 214, 81, -438, 363, 303, 0, 449, 397, -258, 24, 175, -456, -491, 397, -167, -162, -413, -69, -135, -131, -239, -358, 143, -287, 463, 332, -187, -356, 332, 234, -193, -380, 294, 96, -429, -420, 102, -446, 250, -226}, {-43, -430, 136, -301, 93, -450, -55, 459, -389, 240, -117, -273, 1, 458, -15, -417, 426, -163, -40, 457, -284, -156, -446, -20, -301, -437, -494, -203, 440, 375, 345, -97, 236, -423, 437, 162, 57, -423, 181, 381, -144, 469, 142, -452, -217, 437, -27, -236, -162, -188, -384, 312, 8, -188, 55, -145, 100, -211, -437, 58, 106, -435, -270, -219, -110, -358, 34, -95, -316, 386, 204, -213, 368, -152, 95, -420, -203, -461, 202, 132, 69, 180, -377, -487, 329, 240, -118, -57, -375, -280, 168, 48, 255, -425, 337, -387, 483, 39, -105, -449, 56, 141, 429, 280, 453, 288, -367, -229, -102, -284, 193, -197, -275, -138, 460, 184, -66, -275, -270, -317, -116, 219, -165, 469, -147, -6, -313, -317, 500, 97, -240, 122, 86, -463, 195, -143, -388, -160, -301, 69, 44, 97, -329, -309, 405, -449, -278, -206, -304, 63, 367, 388, -288, 310, -160, -288, 485, 141, -260, 333, -295, -53, 354}, {159, -397, -238, 155, 434, 409, -434, -353, -226, 31, 456, -455, 23, -190, -400, -230, -196, 259, 367, -492, 406, 164, -460, -366, 130, -226, -17, -291, -27, 78, -218, -126, 470, 2, 196, 409, -211, -45, 420, -143, 24, 75, 117, 51, -82, -155, -163, 325, -141, 121, 63, -17, -433, -52, -418, 309, -200, 16, 196, 76, -407, 445, -160, -375, 37, 230, -272, 488, 301, 61, 58, -483, -408, -334, 114, -389, -200, 98, -281, -99, -442, -246, -83, 24, -394, -102, 61, 397, 391, -38, -197, -220, 292, 80, -270, 374, 311, -17, -260, -427, 419, 241, 192}, {-35, -243, -76, -189, 176, -14, -37, -81, -122, 287, 128, -385, 321, 425, -147, -108, -129, 191, -271, -448, -302, -257, 197, -310, -337, 2, -147, 194, -82, -480, -402, 220, -325, 208, -73, 189, 124, -324, 24, -431, -371, -397, 165, 207, 367, 390, 450, 458, 156, -495, 388, 163, -436, 335, -403, 390, 366, -216, -464, 388, 108, 319, -282, -236, -493, -360, 493, 150, -108, 438, -87, 441, -317, -123, -161, 165, -214, 130, 236, -104, 448, -360, -342, -432, -208, -184, -204, -345, -390, 370, 380, -26, -146, -286, 294, -339, -34, -253, 169, 198, 442, 309, -45, 56, -409, 82, -374}, {-322, -435, 42, 364, -119, -417, -363, 495, -239, 224, -412, -411, 396, 268, -493, -170, 409, 84, 446, -436, 450, -149, -460, -308, 372, -407, 218, 474, -498, -403, 164, -102, -230, 38, 425, 138, -157, 335, -145, -423, 198, 461, 131, 347, 179, -318, 301, 146, 223, -463, 320, -412, 392, -246, -325, 345, -422, 296, -192, 351, 8, 348, -185, -355, -151, 161, -407, 343, -37, -202, -488, -371, -206, 251, 446, -385, -102, 397, -389, 362, -211, -330, 472, -194, -229, 397, 440, -16, -239, 380, 181, -156, -112, 59, 310, 308, -256, -468, -280, -114, -286, 302, -183, 236, 462, 361, -444, 276, -375, -436, -381, 46, -240, -133, 61, 296, -157, -473, -346, -302, 105, 346, -244, 368, 329, 16, 473, -168, -241, -104, -166, -67, -202, 367, -256, 280, 129, 84, 312, 430, -132, 393, -110, 24, 298, 248, -24, 336, 54, -328, 381, -155, -272, 56, 396, 329, 344, -303, 119, 126, -457, 344, -132, -477, -406, -187, -385, -244, 252, -436, 234, -355, 225, 384, -431, -440, 269, -97, -229, -307, -29, 437, 420, -279}, {405, -453, -484, -453, 443, 489, 50, 455, 17, 65, 114, 383, -256, -225, 95, 389, -54, -494, 292, 105, 293, -356, -155, -299, 152, -328, 93, 352, 56, 429, -351, -251, -421, -338, -207, -443, -153, 26, -355, -125, -481, -290, -134, -478, -450, 304, 369, -426, -207, -44, 393, -330, 229, -494, 213, 102, -297, -453, -177, -388, -224, 328, 6, -499, -365, 278, 353, -399, 85, 479, -365, 479, 412, -381, -137, -31, 402, 283, 410, 85, 379, -289, 458, 118, -235, 164, -400, -231, 232, 464, -384, -314, 230, 415, -288, 205, 55, -344, 46, 225, 5, 428, 320, 20, 333, -120, -97, -350, 250, -178}, {500, -309, 83, -124, -230, -335, -162, -137, -22, 415, 336, -479, 430, -486, -254, 93, -276, 244, -72, -229, 308, 64, 26, 162, -70, 343, 437, 394, -468, -298, -42, -430, 220, 189, -435, -120, 140, 387, 250, -100, 18, 228, -210, -292, -206, -383, 282, -95, -197, -246, -491, -487, -29, 141, -387, -135, 228, 8, 251, 31, -338, -261, 489, 319, 394, -259, -268, -5, 497, -41, -307, -310, 89, 353, -452, -322, -372, 330, 102, -453, 72, 18, -223, -211, -239, 257, -444, 237, 189, 345, 49, 168, -151, -137, -84, 205, 266, -445, -162, 444, 86, 30, 400, -386, -376, -221, -308, -129, -491, -376, -247, -107, 234, -7, -271, 187, -105, 21, -170, 457, 426, 292, 168, 49, -392, -415, 106, -333, 304}, {457, -249, -356, 194, 185, -481, -261, -491, -477, 368, -344, -186, 258, 257, 162, 57, 387, 42, 365, -82, -281, -143, 345, 59, -432, -179, -328, -213, -355, 102, 43, 495, 107, -44, -200, 297, 480, -305, 265, -374, -379, -436, -197, -380, 374, 466, -181, 305, -288, -307, 453, 260, -278, 207, 256, 16, 327, -378, -138, 130, 432, 124, 466, -393, -495, -75, 497, -92, 111, -79, 363, -244, -361, -202, 353, -3, 186, 15, -386, -412, 81, -51, 294, -442, -94, 244, -6, 424, -313, 37, 86, 499, -317, 167, -461, -291, -366, 258, -189, 387, -494, -360, 404, -498, -454, 3, -245, -60, -83, 319, 20, -246, 434, 195, 492, 75, -254, -370, 140, 408, 300, 214, 417, -335, 254, -448, -153, 459, 344, 478, 235, -138, -275, -65, -386, -154, -390, 84, -222, -192, -294, 410, 149, -401, -279, -488, 174, 490, 26, -264, -372, 325, 236, 458, 188, 339, 357, -362, 167, -322, 287, 205, 303, 299, -371, 416, 435}};
    public static int[][] in_org_0 = test_common.copy(in_0);
    public static int[] in_1 = {6, 2, 1, 17, 7, 13, 5, 2, 13, 17, 14, 65, 13, 26, 30, 28, 29, 46, 86, 9, 7, 51, 33, 31, 66, 82, 31, 42, 9, 27, 10, 66, 126, 131, 10, 95, 151, 33, 90, 125, 62, 125, 125, 102, 49, 5, 59, 63, 112, 16, 56, 79, 34, 60, 83, 6, 111, 42, 68, 1};
    public static int[] in_org_1 = test_common.copy(in_1);
    public static int[] out = {10, 5, 1, 18, 11, 18, 7, 0, 14, 17, -57, 80, -64, -11, -14, -36, 28, 28, 91, -75, -83, 49, -25, -21, 57, 97, -14, -3, -78, -5, -392, 25, 246, 156, -392, 1, 296, -223, 135, 352, -21, 427, 101, 258, -159, -433, -169, 169, 127, -339, -143, -109, -206, -188, 259, -432, 129, -178, -7, -495};
}
