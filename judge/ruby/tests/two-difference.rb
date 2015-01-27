T_num_test = 50
T_in_0 = [[-29, -23, -22, 21, 25], [-22, 3, 4, 5, 6, 16, 22], [-30, -19, -15, -11, -7, -2, 0, 4, 13, 15, 20, 23, 28], [-29, -21, -19, -18, -5, 10, 12, 18, 26, 30], [-29, -26, -17, -14, -13, -6, -3, 7, 8, 14, 16, 17, 20], [-497, -487, -482, -472, -469, -466, -462, -453, -450, -441, -438, -431, -420, -404, -395, -379, -374, -370, -343, -337, -334, -321, -317, -314, -313, -310, -297, -295, -280, -273, -271, -266, -265, -264, -251, -244, -240, -237, -236, -233, -224, -221, -215, -214, -206, -203, -193, -184, -176, -168, -166, -165, -158, -141, -140, -135, -111, -110, -105, -104, -92, -90, -85, -79, -75, -74, -72, -71, -69, -64, -62, -60, -22, -21, -8, 0, 7, 30, 32, 47, 58, 63, 69, 73, 85, 92, 94, 95, 98, 115, 140, 145, 146, 152, 155, 156, 157, 164, 177, 182, 194, 198, 199, 200, 201, 224, 225, 231, 237, 246, 253, 266, 281, 284, 285, 288, 289, 300, 302, 307, 312, 315, 316, 325, 328, 330, 342, 345, 351, 352, 353, 360, 367, 368, 369, 370, 372, 374, 384, 385, 390, 395, 397, 400, 408, 425, 445, 449, 455, 458, 461, 468, 483], [-498, -496, -495, -494, -489, -488, -485, -470, -459, -457, -453, -452, -435, -434, -433, -419, -417, -415, -408, -401, -395, -393, -390, -389, -386, -384, -378, -374, -373, -370, -362, -352, -351, -336, -333, -319, -316, -311, -304, -298, -296, -293, -292, -284, -283, -279, -278, -267, -263, -251, -246, -226, -222, -221, -219, -214, -210, -190, -179, -178, -149, -133, -122, -114, -102, -101, -96, -93, -88, -87, -85, -81, -76, -67, -61, -55, -48, -40, -31, -17, -8, -6, 4, 15, 16, 18, 30, 32, 48, 50, 53, 59, 70, 88, 92, 101, 106, 113, 120, 129, 130, 131, 132, 138, 141, 143, 149, 161, 164, 177, 181, 191, 192, 198, 200, 211, 217, 219, 227, 238, 241, 256, 265, 269, 270, 274, 285, 290, 293, 295, 298, 300, 311, 321, 328, 329, 331, 371, 378, 388, 390, 392, 401, 404, 413, 422, 430, 432, 448, 449, 451, 453, 457, 473, 474, 475, 478, 479, 480, 482, 483, 484, 490, 494, 496, 500], [-490, -488, -484, -479, -475, -471, -470, -465, -462, -459, -456, -449, -446, -445, -436, -434, -415, -396, -395, -390, -379, -376, -373, -370, -366, -365, -363, -338, -317, -308, -305, -304, -266, -262, -205, -197, -192, -187, -161, -148, -140, -109, -92, -91, -80, -78, -59, -52, -32, -29, -15, -10, -1, 6, 28, 33, 59, 102, 107, 108, 115, 116, 129, 137, 143, 150, 163, 168, 170, 176, 187, 191, 213, 231, 281, 292, 310, 315, 318, 327, 329, 334, 337, 360, 370, 377, 419, 420, 424, 430, 438, 451, 455, 472, 490, 496], [-493, -488, -485, -481, -471, -454, -452, -451, -445, -436, -434, -432, -428, -417, -414, -400, -388, -379, -373, -371, -360, -356, -351, -334, -320, -308, -307, -304, -302, -299, -294, -290, -284, -274, -261, -246, -238, -236, -229, -225, -219, -218, -199, -196, -173, -166, -158, -154, -144, -132, -120, -113, -109, -108, -98, -95, -86, -79, -75, -73, -67, -62, -60, -58, -55, -45, -28, -27, -22, -19, -8, 0, 1, 2, 33, 36, 44, 52, 57, 58, 61, 71, 84, 85, 100, 110, 112, 121, 129, 130, 141, 142, 155, 157, 170, 171, 180, 184, 200, 201, 205, 210, 220, 223, 230, 244, 246, 248, 257, 260, 265, 268, 272, 279, 285, 287, 304, 331, 336, 340, 342, 351, 355, 356, 375, 385, 404, 410, 413, 414, 418, 428, 431, 444, 454, 462, 469, 470, 477, 485, 487, 493, 496, 499], [-496, -481, -466, -460, -458, -443, -435, -430, -420, -418, -417, -414, -413, -411, -409, -403, -401, -393, -377, -369, -342, -337, -322, -316, -313, -309, -307, -304, -293, -290, -286, -282, -275, -270, -255, -240, -223, -221, -220, -217, -213, -192, -190, -185, -183, -175, -172, -168, -166, -163, -161, -160, -157, -155, -147, -146, -144, -139, -132, -127, -119, -112, -111, -109, -104, -102, -99, -93, -73, -71, -60, -47, -46, -44, -35, -18, -1, 2, 6, 11, 12, 14, 20, 23, 27, 28, 42, 52, 53, 57, 75, 79, 90, 92, 93, 94, 113, 121, 125, 128, 147, 154, 164, 171, 175, 179, 182, 187, 189, 209, 210, 215, 231, 233, 237, 243, 259, 262, 265, 271, 279, 282, 285, 289, 315, 320, 351, 353, 359, 360, 365, 402, 403, 404, 405, 406, 425, 429, 451, 459, 465, 468, 469, 472, 485, 490], [-492, -491, -488, -487, -474, -465, -464, -458, -453, -450, -448, -442, -438, -433, -430, -428, -419, -417, -409, -400, -399, -397, -385, -380, -364, -356, -327, -320, -314, -308, -304, -299, -298, -293, -281, -279, -276, -274, -260, -259, -250, -247, -242, -236, -234, -226, -211, -209, -205, -194, -193, -192, -187, -183, -171, -166, -161, -160, -158, -156, -155, -150, -148, -142, -140, -127, -123, -101, -94, -93, -92, -90, -63, -62, -58, -52, -45, -33, -21, -20, -4, 4, 5, 6, 8, 10, 13, 18, 32, 34, 35, 54, 75, 84, 98, 99, 104, 111, 117, 121, 129, 130, 133, 137, 138, 144, 160, 167, 168, 175, 178, 190, 193, 199, 203, 205, 206, 213, 214, 215, 217, 222, 223, 243, 247, 252, 254, 259, 268, 278, 282, 288, 290, 296, 301, 303, 306, 318, 321, 326, 330, 331, 335, 337, 351, 357, 358, 359, 361, 362, 366, 376, 379, 390, 394, 411, 422, 434, 436, 442, 449, 450, 452, 463, 470, 482, 485, 487, 488, 491, 500], [-478, -458, -455, -449, -447, -436, -433, -422, -417, -416, -407, -394, -391, -365, -361, -355, -349, -346, -326, -308, -300, -294, -249, -221, -216, -215, -213, -209, -198, -179, -174, -172, -163, -153, -135, -131, -130, -123, -115, -99, -98, -89, -86, -84, -79, -62, -61, -58, -47, -41, -34, -16, -10, -9, 12, 14, 15, 21, 23, 32, 37, 45, 57, 65, 89, 101, 111, 138, 140, 150, 153, 156, 159, 161, 178, 185, 195, 207, 210, 222, 223, 225, 226, 233, 238, 248, 249, 250, 251, 261, 270, 280, 287, 288, 290, 291, 302, 317, 322, 336, 339, 341, 347, 357, 358, 364, 373, 374, 376, 379, 381, 388, 400, 405, 409, 410, 411, 418, 425, 426, 430, 433, 434, 438, 444, 450, 452, 465, 469, 475, 487, 491], [-488, -481, -472, -471, -470, -466, -464, -449, -429, -422, -420, -416, -410, -408, -394, -388, -379, -377, -375, -368, -362, -356, -336, -333, -329, -324, -312, -306, -301, -296, -285, -277, -273, -261, -252, -209, -204, -183, -181, -156, -153, -136, -114, -108, -100, -93, -92, -81, -80, -68, -67, -66, -64, -61, -52, -39, -37, -31, -25, -11, 4, 6, 16, 17, 24, 29, 38, 49, 67, 71, 74, 79, 85, 100, 101, 102, 105, 114, 115, 126, 127, 154, 157, 169, 170, 184, 189, 194, 195, 212, 226, 230, 233, 252, 254, 270, 275, 276, 290, 292, 294, 298, 307, 323, 330, 350, 354, 359, 361, 379, 398, 419, 426, 449, 453, 462, 475, 487, 491], [-499, -482, -472, -468, -459, -456, -455, -448, -425, -421, -419, -416, -414, -409, -399, -396, -389, -373, -355, -351, -340, -332, -330, -324, -310, -309, -308, -293, -289, -285, -271, -266, -233, -228, -227, -213, -209, -203, -196, -189, -188, -181, -171, -168, -167, -158, -153, -144, -139, -131, -129, -124, -119, -116, -114, -112, -105, -99, -95, -90, -83, -73, -70, -66, -59, -56, -55, -53, -52, -37, -34, -19, -18, -15, -14, -7, -4, 0, 2, 5, 6, 8, 14, 16, 21, 41, 46, 52, 59, 70, 73, 82, 86, 94, 100, 111, 120, 122, 125, 127, 144, 145, 147, 149, 150, 152, 161, 165, 173, 177, 186, 193, 196, 199, 204, 205, 207, 208, 209, 213, 220, 226, 230, 233, 249, 252, 253, 254, 269, 281, 284, 287, 289, 290, 292, 301, 304, 313, 314, 319, 324, 326, 336, 341, 344, 347, 355, 365, 366, 372, 382, 385, 394, 402, 417, 420, 421, 447, 451, 452, 453, 457, 462, 471, 472, 478, 481, 483, 486, 487, 489, 490], [-487, -483, -482, -478, -468, -450, -449, -448, -444, -441, -436, -429, -428, -424, -420, -416, -406, -405, -394, -389, -380, -367, -362, -361, -354, -350, -347, -335, -328, -323, -318, -301, -295, -288, -286, -284, -272, -263, -257, -255, -248, -237, -225, -224, -220, -214, -195, -193, -185, -183, -173, -163, -148, -132, -128, -118, -116, -110, -107, -98, -93, -91, -79, -74, -58, -54, -47, -45, -43, -41, -32, -30, -2, 7, 16, 17, 23, 26, 28, 31, 64, 71, 78, 82, 86, 88, 91, 98, 107, 108, 112, 113, 116, 125, 127, 133, 138, 141, 145, 146, 156, 162, 165, 171, 173, 193, 199, 203, 210, 212, 221, 244, 250, 260, 264, 265, 269, 277, 279, 290, 313, 321, 346, 347, 360, 370, 372, 386, 392, 399, 400, 425, 437, 440, 442, 444, 446, 460, 462, 463, 473, 481, 488], [-498, -494, -491, -479, -477, -474, -468, -467, -461, -449, -446, -439, -437, -436, -429, -426, -423, -422, -415, -411, -399, -392, -373, -363, -353, -341, -337, -326, -324, -313, -309, -294, -288, -283, -276, -256, -239, -236, -233, -229, -224, -220, -216, -204, -196, -191, -182, -178, -170, -169, -166, -160, -156, -154, -130, -124, -120, -119, -116, -104, -103, -100, -88, -87, -80, -72, -54, -52, -44, -38, -37, -35, -16, -3, -2, 3, 4, 7, 23, 26, 32, 38, 39, 50, 61, 67, 84, 85, 86, 87, 90, 93, 99, 114, 120, 122, 131, 133, 139, 141, 159, 164, 167, 171, 174, 175, 179, 206, 209, 213, 219, 224, 227, 228, 229, 232, 235, 239, 243, 245, 263, 265, 273, 275, 276, 283, 284, 299, 308, 313, 315, 321, 322, 323, 341, 349, 351, 352, 354, 362, 369, 376, 383, 389, 390, 393, 406, 409, 414, 439, 442, 445, 472, 479, 482, 487, 493, 498, 499], [-499, -490, -417, -396, -393, -389, -372, -365, -361, -335, -327, -324, -312, -311, -309, -302, -300, -281, -274, -273, -260, -258, -253, -246, -239, -233, -217, -215, -190, -175, -173, -168, -167, -151, -139, -129, -113, -105, -75, -62, -49, -47, -37, -15, -11, -8, 10, 22, 27, 31, 38, 45, 61, 69, 82, 92, 130, 139, 142, 152, 163, 181, 187, 191, 193, 204, 228, 234, 250, 265, 276, 277, 278, 287, 288, 290, 293, 299, 300, 312, 324, 325, 343, 351, 371, 374, 388, 389, 408, 409, 411, 435, 436, 460, 464, 486], [-494, -486, -468, -464, -460, -432, -419, -418, -396, -393, -371, -369, -360, -359, -357, -348, -344, -331, -329, -318, -298, -280, -270, -265, -261, -256, -232, -227, -205, -199, -197, -184, -174, -158, -150, -146, -134, -104, -88, -83, -73, -67, -58, -56, -20, -16, -8, -6, 8, 41, 47, 59, 60, 73, 77, 81, 95, 97, 115, 126, 139, 142, 145, 163, 164, 168, 176, 182, 188, 215, 229, 232, 233, 243, 248, 260, 269, 270, 272, 273, 274, 285, 286, 290, 292, 294, 295, 304, 306, 312, 313, 322, 336, 349, 369, 372, 374, 375, 377, 380, 386, 417, 420, 423, 428, 448, 469, 477, 484], [-494, -485, -473, -471, -469, -442, -439, -438, -432, -425, -422, -402, -378, -372, -371, -357, -345, -334, -331, -315, -281, -280, -275, -273, -270, -269, -263, -260, -251, -228, -219, -214, -211, -198, -188, -172, -169, -145, -142, -127, -112, -111, -107, -92, -83, -79, -70, -50, -48, -44, -38, -21, -14, -13, -12, 2, 16, 58, 64, 74, 92, 95, 103, 109, 117, 121, 123, 134, 135, 157, 162, 170, 174, 207, 210, 216, 223, 225, 230, 237, 241, 263, 268, 281, 289, 292, 296, 308, 310, 319, 320, 328, 340, 343, 349, 351, 353, 372, 388, 397, 401, 420, 421, 444, 476, 481, 484], [-499, -497, -494, -487, -485, -482, -477, -475, -469, -467, -455, -454, -447, -438, -433, -432, -424, -413, -403, -400, -399, -396, -379, -354, -353, -352, -350, -344, -341, -326, -321, -314, -309, -305, -286, -283, -280, -265, -236, -235, -228, -227, -219, -218, -217, -212, -200, -193, -181, -179, -178, -177, -169, -163, -161, -156, -121, -120, -115, -104, -102, -96, -84, -73, -60, -42, -37, -25, -19, -2, 2, 16, 18, 51, 64, 70, 80, 103, 116, 134, 137, 155, 166, 167, 170, 172, 179, 185, 196, 201, 204, 210, 211, 214, 217, 219, 242, 251, 253, 261, 264, 267, 269, 273, 275, 281, 288, 292, 293, 303, 314, 317, 328, 333, 334, 335, 346, 355, 384, 387, 388, 417, 419, 420, 422, 434, 438, 441, 446, 448, 450, 463, 479, 481, 493, 497, 499], [-499, -485, -480, -455, -435, -430, -419, -415, -413, -412, -400, -398, -385, -379, -376, -373, -355, -351, -348, -347, -335, -330, -327, -311, -307, -304, -298, -251, -193, -177, -143, -137, -125, -124, -123, -105, -93, -91, -90, -73, -57, -50, -31, -26, -15, -10, 6, 7, 16, 28, 29, 32, 33, 35, 41, 50, 56, 76, 81, 90, 94, 95, 96, 123, 149, 153, 157, 159, 178, 198, 221, 223, 229, 242, 251, 264, 273, 283, 289, 296, 300, 309, 316, 317, 364, 389, 390, 406, 415, 422, 427, 436, 440, 450, 487, 489], [-496, -494, -493, -491, -490, -485, -478, -476, -475, -457, -455, -440, -438, -431, -423, -419, -417, -414, -413, -410, -407, -402, -392, -386, -385, -381, -372, -371, -352, -351, -345, -344, -342, -340, -336, -334, -331, -329, -325, -318, -312, -311, -306, -305, -301, -299, -281, -274, -253, -245, -238, -232, -229, -222, -220, -214, -204, -191, -184, -182, -175, -171, -144, -142, -136, -134, -131, -124, -118, -95, -94, -90, -84, -81, -64, -62, -50, -49, -47, -46, -31, -28, -24, -23, -15, -11, -3, 6, 17, 21, 22, 34, 43, 52, 62, 66, 75, 88, 101, 107, 121, 124, 135, 137, 145, 149, 152, 154, 156, 158, 165, 167, 168, 169, 175, 180, 195, 197, 206, 208, 214, 219, 234, 257, 261, 270, 271, 272, 277, 286, 289, 293, 301, 304, 316, 324, 326, 328, 331, 356, 361, 362, 363, 365, 371, 379, 385, 388, 399, 400, 407, 413, 415, 421, 427, 430, 433, 437, 439, 462, 473, 474, 477, 486, 492, 494, 500], [-498, -494, -484, -480, -473, -457, -455, -448, -447, -444, -437, -429, -426, -425, -417, -408, -391, -372, -348, -340, -338, -335, -308, -292, -280, -277, -275, -267, -251, -242, -230, -225, -223, -216, -191, -187, -174, -172, -170, -165, -158, -156, -151, -148, -98, -70, -55, -52, -33, -23, -21, 1, 3, 5, 17, 18, 43, 48, 61, 67, 68, 73, 106, 108, 111, 113, 131, 146, 151, 155, 166, 183, 196, 197, 203, 210, 213, 218, 226, 235, 251, 260, 281, 285, 289, 300, 305, 310, 327, 333, 338, 345, 356, 357, 363, 365, 427, 431, 437, 438, 452, 459, 460, 477, 479, 482, 485], [-500, -498, -495, -494, -490, -489, -488, -467, -460, -431, -420, -417, -412, -410, -402, -401, -399, -396, -393, -386, -384, -383, -378, -377, -371, -370, -367, -352, -345, -336, -319, -309, -304, -275, -270, -269, -258, -251, -246, -245, -242, -225, -224, -215, -211, -205, -199, -191, -185, -184, -183, -174, -171, -164, -157, -154, -147, -140, -138, -137, -124, -122, -101, -90, -89, -87, -77, -74, -73, -69, -62, -59, -58, -53, -35, -28, -26, -25, -18, -17, -9, -4, 4, 8, 10, 18, 23, 30, 34, 38, 39, 47, 51, 60, 66, 76, 77, 79, 86, 91, 97, 99, 119, 131, 135, 137, 147, 148, 154, 156, 166, 173, 190, 209, 214, 234, 238, 244, 261, 264, 269, 271, 276, 279, 285, 289, 291, 292, 302, 314, 315, 328, 336, 340, 342, 344, 345, 350, 354, 358, 362, 369, 380, 385, 387, 388, 390, 392, 402, 408, 415, 428, 438, 442, 459, 461, 463, 481, 485, 486, 487, 495, 496], [-498, -486, -483, -482, -461, -452, -440, -418, -416, -404, -403, -379, -375, -365, -361, -348, -342, -323, -316, -315, -304, -303, -292, -291, -288, -256, -254, -244, -239, -234, -215, -214, -200, -197, -193, -192, -178, -146, -139, -135, -110, -108, -82, -76, -67, -60, -37, -32, -29, -27, -22, -18, -17, -13, -10, 22, 24, 28, 52, 54, 55, 58, 75, 88, 100, 109, 111, 115, 126, 127, 132, 151, 161, 169, 181, 192, 208, 217, 225, 232, 236, 244, 246, 278, 286, 296, 318, 319, 340, 345, 351, 358, 366, 380, 388, 391, 412, 416, 419, 420, 435, 436, 450, 463, 479, 480, 488, 491, 496, 497, 498], [-500, -488, -487, -486, -485, -480, -474, -464, -458, -457, -456, -449, -448, -447, -446, -443, -435, -423, -417, -416, -410, -388, -386, -383, -376, -371, -370, -359, -356, -354, -352, -341, -340, -333, -321, -311, -310, -306, -302, -299, -292, -289, -282, -277, -275, -269, -265, -264, -258, -255, -252, -251, -245, -237, -228, -225, -219, -208, -202, -194, -188, -187, -181, -175, -171, -163, -161, -159, -140, -134, -133, -127, -123, -115, -113, -111, -106, -104, -103, -102, -98, -86, -81, -72, -54, -41, -38, -30, -17, -14, -7, -2, -1, 0, 8, 14, 30, 36, 37, 53, 79, 81, 117, 121, 132, 139, 145, 150, 167, 193, 196, 205, 208, 209, 211, 212, 216, 218, 230, 241, 268, 280, 287, 288, 291, 293, 299, 304, 305, 314, 321, 325, 327, 342, 350, 363, 382, 391, 394, 396, 407, 408, 417, 418, 424, 438, 443, 444, 447, 451, 453, 467, 474, 483, 484, 485, 486, 487, 492], [-493, -483, -482, -478, -476, -473, -467, -456, -453, -452, -449, -438, -433, -423, -422, -421, -417, -382, -372, -371, -350, -342, -328, -326, -318, -316, -298, -282, -265, -260, -221, -218, -194, -191, -184, -183, -176, -169, -167, -162, -151, -143, -120, -118, -107, -93, -83, -58, -48, -46, -30, -29, -25, -15, -9, -5, -2, 0, 6, 13, 16, 21, 26, 29, 32, 51, 70, 79, 86, 93, 102, 109, 110, 113, 118, 119, 120, 122, 128, 129, 137, 144, 152, 158, 177, 184, 186, 189, 196, 200, 204, 208, 212, 215, 219, 228, 246, 248, 253, 260, 263, 264, 276, 277, 284, 304, 318, 321, 326, 328, 338, 339, 356, 358, 361, 364, 392, 399, 405, 411, 425, 433, 437, 438, 443, 444, 450, 460, 464, 468, 472, 483], [-495, -486, -475, -474, -462, -455, -438, -435, -432, -410, -390, -387, -386, -381, -376, -366, -347, -345, -330, -307, -300, -289, -273, -264, -256, -250, -243, -227, -223, -216, -214, -204, -201, -187, -186, -182, -181, -180, -176, -173, -170, -158, -155, -142, -136, -133, -89, -83, -79, -78, -74, -69, -65, -61, -58, -53, -20, -18, 3, 12, 17, 19, 29, 31, 33, 36, 57, 75, 97, 105, 118, 128, 135, 151, 156, 164, 177, 199, 208, 218, 224, 256, 259, 261, 276, 295, 324, 339, 355, 356, 363, 368, 372, 386, 403, 412, 428, 429, 430, 437, 453, 456, 457, 466, 471, 479, 487, 492, 496], [-487, -479, -459, -451, -449, -422, -420, -418, -416, -397, -393, -373, -370, -369, -362, -361, -335, -332, -330, -328, -323, -319, -298, -290, -283, -256, -255, -250, -218, -217, -214, -202, -194, -173, -165, -164, -133, -123, -110, -107, -104, -101, -95, -88, -75, -74, -73, -69, -68, -59, -57, -50, -48, -43, -33, -23, -22, 12, 15, 83, 84, 85, 127, 128, 135, 140, 159, 160, 191, 196, 227, 229, 243, 245, 252, 264, 265, 266, 267, 271, 276, 277, 288, 297, 318, 322, 332, 334, 335, 336, 338, 345, 368, 370, 373, 380, 388, 409, 410, 412, 419, 439, 440, 473, 486, 487, 496], [-499, -492, -489, -481, -480, -475, -471, -470, -466, -461, -450, -448, -444, -441, -431, -427, -423, -415, -410, -409, -407, -394, -392, -390, -388, -387, -386, -385, -382, -380, -378, -376, -356, -350, -347, -343, -337, -334, -333, -329, -323, -322, -316, -308, -307, -300, -294, -291, -264, -248, -236, -231, -223, -220, -218, -211, -210, -206, -205, -203, -195, -192, -187, -180, -165, -161, -160, -158, -157, -141, -132, -130, -120, -112, -111, -105, -97, -85, -81, -80, -79, -73, -68, -56, -52, -47, -44, -43, -34, -27, -22, -15, -7, -5, 5, 6, 7, 8, 9, 14, 26, 30, 33, 36, 45, 67, 72, 76, 85, 87, 91, 93, 100, 108, 111, 114, 117, 119, 130, 136, 141, 153, 155, 161, 163, 167, 168, 178, 181, 192, 195, 197, 203, 206, 212, 214, 220, 228, 230, 240, 241, 245, 251, 256, 259, 272, 275, 282, 296, 299, 311, 317, 323, 327, 329, 331, 333, 340, 344, 362, 364, 370, 378, 391, 406, 408, 419, 423, 424, 426, 429, 443, 449, 465, 470, 471, 477, 479, 497, 498], [-497, -491, -487, -485, -468, -455, -451, -448, -446, -443, -438, -432, -421, -420, -411, -396, -395, -380, -375, -373, -358, -353, -349, -338, -334, -333, -328, -325, -300, -278, -268, -259, -258, -256, -249, -246, -225, -222, -219, -213, -211, -208, -201, -198, -193, -190, -189, -182, -176, -166, -144, -142, -140, -139, -138, -110, -102, -93, -84, -82, -81, -77, -75, -74, -70, -55, -44, -42, -41, -36, -34, -24, -19, -7, -6, -3, -1, 5, 22, 27, 46, 47, 49, 51, 54, 66, 78, 94, 107, 108, 112, 114, 125, 132, 134, 136, 147, 154, 157, 163, 166, 172, 177, 184, 191, 201, 221, 225, 255, 266, 269, 272, 276, 283, 303, 310, 327, 333, 344, 354, 363, 368, 375, 381, 397, 407, 416, 428, 432, 444, 446, 463, 492, 493], [-483, -467, -462, -445, -438, -437, -429, -421, -415, -390, -376, -366, -360, -339, -335, -332, -303, -302, -268, -265, -258, -252, -225, -209, -207, -202, -200, -199, -195, -178, -162, -143, -103, -102, -82, -74, -63, -50, -45, -30, 1, 2, 14, 20, 21, 31, 41, 45, 46, 52, 60, 63, 67, 69, 80, 82, 109, 110, 112, 130, 133, 152, 161, 166, 169, 185, 189, 193, 201, 207, 211, 224, 240, 241, 257, 276, 281, 293, 320, 324, 340, 342, 353, 359, 363, 378, 387, 388, 396, 397, 410, 411, 412, 415, 417, 420, 431, 450, 452, 454, 458, 479, 482, 489, 491], [-495, -494, -486, -475, -474, -472, -468, -458, -457, -449, -441, -430, -423, -419, -402, -401, -368, -365, -364, -363, -361, -354, -347, -344, -342, -335, -332, -329, -320, -314, -312, -308, -302, -290, -287, -282, -280, -273, -266, -264, -259, -258, -256, -254, -232, -223, -221, -209, -207, -206, -202, -199, -194, -170, -166, -165, -160, -155, -151, -150, -147, -138, -135, -134, -125, -122, -121, -120, -118, -106, -96, -94, -93, -91, -88, -82, -79, -71, -59, -57, -52, -50, -30, -22, -19, -11, -9, -7, -1, 4, 10, 12, 18, 26, 27, 34, 44, 45, 46, 48, 50, 61, 68, 71, 81, 89, 90, 100, 101, 107, 113, 114, 118, 119, 121, 122, 127, 130, 131, 136, 141, 145, 158, 159, 160, 161, 162, 169, 172, 178, 186, 189, 194, 195, 196, 202, 203, 209, 212, 215, 221, 242, 244, 246, 252, 262, 264, 273, 274, 278, 287, 288, 290, 292, 302, 317, 326, 336, 345, 352, 362, 372, 394, 396, 399, 404, 408, 411, 417, 425, 439, 460, 463, 468, 470, 485, 494], [-499, -493, -489, -478, -470, -451, -441, -437, -433, -425, -420, -398, -379, -375, -374, -372, -353, -348, -344, -341, -319, -318, -315, -313, -310, -298, -281, -279, -278, -277, -261, -254, -247, -236, -230, -216, -214, -212, -210, -204, -190, -182, -174, -173, -167, -164, -161, -148, -122, -120, -118, -103, -101, -97, -85, -75, -70, -64, -49, -42, -27, 1, 3, 19, 29, 36, 48, 49, 53, 60, 61, 76, 77, 78, 85, 88, 89, 94, 103, 113, 117, 129, 138, 139, 144, 145, 150, 157, 192, 218, 224, 235, 237, 240, 244, 245, 257, 267, 281, 299, 300, 305, 311, 313, 315, 317, 319, 329, 333, 343, 348, 361, 366, 367, 369, 372, 373, 380, 383, 386, 387, 396, 398, 402, 413, 419, 420, 433, 439, 443, 446, 453, 458, 477, 483, 488, 490, 492, 494, 496, 497], [-491, -478, -465, -457, -423, -416, -392, -389, -377, -372, -353, -352, -347, -341, -337, -320, -299, -286, -274, -263, -258, -255, -247, -242, -238, -230, -209, -196, -191, -158, -153, -150, -139, -137, -135, -127, -126, -115, -114, -104, -102, -101, -85, -71, -63, -30, -12, -10, -8, 3, 29, 38, 40, 41, 50, 64, 65, 66, 68, 79, 83, 92, 93, 95, 105, 114, 143, 144, 148, 158, 163, 183, 186, 193, 194, 195, 201, 203, 205, 208, 212, 213, 217, 218, 220, 223, 231, 236, 256, 265, 273, 298, 303, 306, 317, 337, 351, 373, 380, 391, 392, 402, 410, 416, 418, 421, 425, 439, 452, 456, 462, 465, 466, 468, 500], [-498, -479, -478, -472, -470, -468, -456, -441, -435, -428, -423, -415, -414, -407, -386, -385, -383, -380, -377, -368, -358, -348, -326, -324, -322, -310, -289, -280, -279, -268, -260, -256, -250, -247, -238, -237, -231, -230, -228, -221, -220, -219, -217, -205, -200, -189, -185, -183, -177, -174, -171, -170, -167, -163, -161, -153, -151, -138, -129, -108, -107, -100, -98, -94, -87, -80, -78, -77, -75, -73, -61, -60, -56, -51, -40, -37, -35, -34, -30, -23, -21, -14, 12, 20, 26, 30, 35, 44, 75, 76, 81, 85, 86, 89, 90, 96, 101, 116, 118, 122, 130, 131, 137, 151, 159, 162, 185, 187, 188, 191, 199, 206, 210, 216, 230, 239, 240, 246, 250, 262, 265, 266, 267, 268, 269, 271, 273, 282, 286, 291, 305, 307, 313, 320, 322, 327, 328, 330, 335, 336, 338, 343, 344, 346, 349, 353, 358, 374, 377, 379, 384, 385, 390, 402, 403, 404, 410, 416, 418, 424, 428, 433, 450, 451, 452, 454, 470, 477, 482, 494, 495, 498], [-495, -492, -491, -479, -464, -460, -455, -454, -451, -446, -442, -437, -435, -428, -427, -411, -401, -395, -392, -389, -388, -387, -382, -372, -369, -366, -351, -349, -331, -317, -301, -298, -289, -288, -280, -277, -276, -272, -242, -241, -238, -234, -226, -224, -214, -208, -204, -199, -194, -192, -191, -190, -185, -180, -179, -166, -153, -152, -142, -135, -132, -124, -123, -113, -100, -90, -89, -84, -61, -52, -50, -42, -31, -29, -26, -24, -11, 0, 1, 5, 6, 7, 11, 12, 21, 23, 30, 32, 33, 37, 41, 51, 59, 63, 68, 70, 76, 78, 80, 88, 97, 102, 116, 117, 119, 127, 131, 136, 144, 146, 148, 151, 155, 163, 176, 178, 181, 187, 213, 215, 231, 234, 235, 237, 243, 252, 268, 271, 294, 305, 314, 315, 325, 336, 344, 348, 356, 366, 387, 403, 407, 414, 426, 437, 447, 448, 449, 452, 471, 478, 491, 492], [-497, -475, -469, -468, -462, -460, -459, -451, -448, -432, -405, -404, -393, -392, -384, -377, -372, -369, -366, -354, -337, -336, -334, -331, -329, -303, -292, -280, -270, -268, -267, -256, -253, -245, -242, -214, -212, -211, -207, -202, -187, -185, -184, -176, -168, -152, -149, -138, -133, -123, -122, -121, -105, -76, -62, -60, -57, -54, -52, -51, -35, -32, -27, -13, -11, -1, 3, 14, 32, 33, 39, 51, 55, 56, 59, 66, 78, 79, 80, 89, 92, 96, 111, 115, 119, 122, 125, 138, 144, 156, 158, 174, 175, 186, 187, 189, 200, 208, 218, 219, 234, 235, 241, 247, 252, 261, 277, 293, 294, 297, 299, 319, 320, 321, 339, 342, 361, 376, 386, 387, 399, 403, 408, 418, 429, 457, 469, 471, 482, 483], [-472, -469, -463, -449, -446, -431, -415, -413, -411, -397, -395, -393, -391, -390, -387, -370, -365, -355, -345, -334, -330, -317, -312, -302, -298, -293, -290, -284, -269, -268, -259, -257, -235, -233, -226, -198, -190, -189, -187, -180, -177, -171, -136, -134, -120, -115, -114, -100, -96, -95, -94, -76, -75, -57, -54, -40, -37, -33, -20, -18, -15, -14, -13, -5, -3, -1, 0, 3, 5, 6, 20, 24, 28, 30, 41, 69, 101, 105, 113, 129, 132, 142, 147, 152, 154, 158, 169, 172, 180, 191, 194, 201, 205, 212, 225, 239, 240, 259, 267, 269, 272, 292, 329, 330, 331, 334, 338, 344, 349, 351, 368, 370, 375, 382, 385, 399, 403, 404, 410, 412, 417, 434, 448, 451, 452, 456, 459, 483, 486], [-500, -497, -484, -478, -477, -459, -458, -454, -446, -439, -431, -426, -424, -416, -415, -412, -408, -406, -399, -398, -395, -390, -388, -382, -380, -379, -373, -370, -368, -351, -346, -342, -341, -332, -315, -309, -308, -307, -281, -275, -273, -270, -266, -263, -255, -252, -248, -227, -226, -224, -215, -211, -204, -196, -192, -187, -180, -178, -177, -176, -173, -169, -163, -162, -160, -159, -145, -141, -123, -122, -121, -107, -99, -91, -89, -88, -82, -72, -71, -67, -61, -59, -50, -44, -39, -37, -36, -33, -31, -26, -14, -10, -6, -4, 5, 6, 24, 26, 27, 41, 44, 56, 57, 61, 67, 72, 82, 83, 101, 103, 111, 112, 118, 125, 129, 134, 138, 143, 145, 147, 149, 157, 158, 161, 165, 173, 183, 188, 190, 204, 225, 226, 231, 232, 236, 244, 245, 258, 261, 262, 266, 270, 275, 282, 294, 298, 299, 305, 307, 321, 337, 340, 352, 359, 365, 366, 370, 372, 373, 379, 383, 389, 409, 415, 416, 423, 424, 432, 447, 450, 459, 483, 485, 490, 492, 493, 496], [-477, -468, -466, -459, -457, -443, -440, -435, -432, -420, -419, -385, -380, -377, -375, -370, -367, -363, -338, -337, -327, -325, -321, -311, -309, -303, -297, -296, -280, -255, -247, -235, -214, -203, -165, -149, -148, -145, -143, -136, -132, -127, -120, -105, -103, -55, -1, 3, 14, 25, 33, 62, 68, 69, 126, 128, 139, 142, 159, 160, 168, 176, 183, 188, 217, 230, 244, 271, 274, 281, 283, 316, 332, 339, 348, 349, 354, 369, 409, 428, 450, 454, 460, 473, 480, 481, 483, 485, 491], [-499, -488, -485, -464, -406, -400, -397, -359, -354, -306, -278, -269, -268, -259, -256, -252, -250, -248, -247, -244, -235, -233, -230, -221, -185, -158, -143, -124, -114, -89, -88, -84, -81, -77, -61, -49, -47, -43, -23, -14, -8, 29, 42, 52, 88, 95, 101, 103, 114, 116, 122, 125, 128, 154, 161, 182, 222, 234, 243, 258, 283, 287, 302, 317, 321, 348, 360, 383, 384, 387, 429, 453, 470, 482, 493], [-496, -495, -492, -484, -478, -454, -451, -433, -411, -390, -351, -345, -338, -329, -315, -290, -275, -267, -266, -243, -239, -230, -173, -167, -166, -159, -102, -74, -71, -55, -49, -47, -19, -15, -13, -11, -5, 5, 8, 22, 23, 35, 56, 68, 77, 84, 90, 94, 97, 104, 105, 114, 124, 129, 143, 155, 163, 207, 212, 221, 241, 252, 261, 276, 292, 296, 313, 318, 321, 340, 363, 367, 377, 394, 407, 417, 420, 422, 431, 464, 473, 477, 480, 483], [-491, -478, -451, -422, -397, -374, -357, -351, -332, -317, -303, -302, -279, -272, -255, -242, -229, -217, -194, -166, -149, -140, -92, -75, -56, -54, -52, -50, -30, -29, -13, -3, -1, 2, 4, 34, 43, 59, 68, 76, 79, 91, 99, 102, 107, 163, 167, 169, 185, 208, 212, 225, 230, 235, 242, 254, 256, 289, 301, 303, 307, 309, 332, 364, 380, 392, 396, 461, 497], [-497, -492, -491, -463, -456, -441, -440, -439, -438, -434, -430, -411, -407, -391, -375, -372, -363, -357, -355, -348, -347, -343, -336, -333, -330, -326, -312, -309, -294, -286, -282, -269, -265, -262, -261, -253, -246, -211, -208, -175, -164, -128, -125, -88, -66, -62, -40, -35, -23, -17, -16, 4, 13, 35, 54, 61, 62, 75, 80, 82, 85, 93, 134, 139, 198, 210, 216, 229, 230, 239, 267, 278, 291, 293, 296, 307, 348, 355, 366, 370, 377, 395, 397, 414, 421, 426, 432, 435, 453, 465, 467, 474, 491], [-485, -483, -460, -459, -428, -419, -416, -414, -411, -407, -401, -398, -389, -385, -378, -362, -357, -349, -337, -318, -317, -314, -296, -274, -273, -259, -254, -248, -234, -231, -214, -212, -205, -147, -131, -116, -111, -97, -76, -68, -33, -23, -21, -17, -12, -10, -4, 2, 23, 37, 42, 43, 108, 116, 134, 137, 145, 146, 163, 194, 202, 206, 216, 236, 243, 250, 281, 297, 314, 327, 329, 336, 341, 357, 358, 360, 378, 404, 412, 433, 438, 458, 466, 470], [-480, -442, -412, -391, -388, -371, -366, -365, -357, -341, -318, -303, -300, -290, -225, -217, -167, -162, -148, -145, -128, -112, -108, -99, -78, -68, -61, -46, -44, -19, -5, 5, 12, 25, 53, 55, 58, 101, 118, 162, 168, 170, 236, 243, 248, 267, 289, 310, 317, 334, 359, 363, 372, 389, 421, 428, 444, 451, 467, 483], [-489, -475, -434, -421, -414, -360, -351, -342, -314, -298, -282, -273, -260, -252, -230, -226, -215, -179, -165, -164, -161, -133, -127, -107, -98, -96, -84, -59, -58, -47, -45, -39, 19, 38, 89, 104, 116, 141, 147, 157, 162, 183, 186, 198, 201, 202, 204, 209, 213, 232, 253, 261, 262, 275, 310, 323, 325, 347, 366, 380, 392, 404, 474, 477, 478, 488, 498], [-497, -496, -482, -474, -445, -417, -409, -400, -395, -374, -373, -354, -351, -345, -340, -337, -333, -328, -327, -324, -302, -276, -269, -253, -252, -245, -230, -191, -181, -180, -175, -174, -159, -137, -134, -129, -107, -94, -88, -84, -80, -60, -27, -9, 20, 47, 55, 62, 92, 93, 96, 106, 115, 131, 132, 133, 142, 175, 180, 197, 200, 209, 212, 218, 253, 263, 274, 300, 305, 310, 314, 318, 319, 340, 350, 371, 381, 388, 398, 437, 439, 459, 470, 488, 489, 491], [-499, -470, -462, -447, -437, -415, -402, -383, -381, -368, -367, -351, -311, -303, -289, -254, -228, -210, -165, -150, -148, -130, -113, -101, -87, -73, -71, -66, -63, -56, -30, 0, 2, 24, 34, 45, 73, 82, 85, 121, 188, 225, 275, 387, 393, 403, 432, 444, 459, 464, 492, 493]]
T_in_org_0 = T_in_0.dup
T_in_1 = [50, 1, 19, 16, 25, 12, 308, 383, 572, 248, 414, 760, 760, 237, 322, 100, 109, 725, 629, 85, 394, 156, 537, 85, 36, 241, 112, 47, 296, 229, 255, 691, 606, 696, 297, 230, 241, 595, 176, 411, -397, -152, 777, -327, -675, -321, -650, -470, -316, 293]
T_in_org_1 = T_in_1.dup
T_out = [[0, 3], [1, 2], [1, 6], [1, 4], [2, 8], [66, 71], [58, 99], [43, 75], [55, 138], [114, 144], [90, 160], [19, 126], [5, 100], [124, 168], [45, 89], [145, 156], [11, 27], [6, 88], [29, 100], [48, 61], [26, 62], [73, 96], [37, 95], [40, 54], [67, 71], [29, 74], [108, 123], [52, 57], [13, 46], [19, 63], [102, 128], [15, 83], [24, 146], [25, 122], [38, 71], [120, 170], [65, 111], [7, 88], [100, 122], [84, 157], [-1, -1], [-1, -1], [-1, -1], [-1, -1], [-1, -1], [-1, -1], [-1, -1], [-1, -1], [-1, -1], [-1, -1]]
def test(answer, i)
    if T_out[i].length != answer.length
        return false
    end
    if T_out[i][0] == -1 && T_out[i][1] == -1
        return answer[0] == -1 && answer[1] == -1
    else
        if answer[0] == -1 || answer[1] == -1
            return false
        else
            return (T_in_0[i][answer[0]] - T_in_0[i][answer[1]]).abs == T_in_1[i]
        end
    end
end
