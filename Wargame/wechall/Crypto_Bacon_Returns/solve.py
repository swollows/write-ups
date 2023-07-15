prob = "bacON's CIpHER OR tHe bacOnIaN CIPHeR iS a meTHoD oF StEGAnoGrApHy (A meThOD Of hidiNG a SecReT meSsAGE aS opposED To A truE CIpHEr) DEvIsEd bY fRaNCiS bacON. a meSsAGe iS cOnCEaled iN The PrEsENtAtIOn oF TeXT, rAtHeR ThaN ITs ContEnt. to EnCoDE a meSSAGE, each leTTEr oF THE pLaiNTEXT IS RePLaced bY a gRoup oF FIvE OF tHe leTtErs 'A' Or 'B'. THIS rEpLACEMEnt IS dOnE ACcOrDING TO The alPHAbeT oF tHe bacONiaN CiPHeR, ShOwn BelOw. notE: A sEcOnD VeRSiOn oF bacON's CIPHEr usEs A UnIQUE cODe fOR each leTtER. iN OTHER WorDs, I aND J Each haS ITS own pATtERN. THe WRiTeR mUst MAKE USe OF Two DiffeREnt typEfaceS FOR ThiS CIPheR. AFTeR PrEpARInG a falSE meSSage WiTH tHe SAMe NUmbeR oF LeTtERS aS All OF tHe aS AnD bS iN tHe REAL, sEcReT meSsAGe, TWo typEfaceS aRE chOSeN, OnE TO rEprEsENT aS AND tHE otHEr BS. tHEn Each leTTeR OF The falSe meSsAge mUst BE prESEntEd iN tHe aPproprIaTe TYPEFace, accORdiNG TO wHEtHeR It stAnDS FOR aN A Or A b. To DEcODE THe meSSage, The REvErsE meTHoD Is AppLIed. each 'TYpEface 1' leTtEr In tHe falSe meSsAge iS RePLAced WiTH AN A aNd each 'TYpEface 2' leTtER iS rEpLaced WItH a b. THE bacONiaN ALPhabeT Is tHeN usED To rECovER THE OrIgiNAl meSSage. aNy METhOD oF wrITING tHe meSsAge THAT allOws two DISTiNCt rEPRESEntATIons For EAch chaRacTeR CaN be UsED FOR tHE BacOn CIpHER. bacOn HImself prepared a biliteral alphabet[2] for handwritten capital and small letters with each having two alternative forms, one to be used as a and the other as b. this was published as an illustrated plate in his de augmentis scientiarum (the advancement of learning). because any message of the right length can be used to carry the encoding, the secret message is effectively hidden in plain sight. the false message can be on any topic and thus can distract a person seeking to find the real message."
upper = 'A'
lower = 'B'
result = ""

for letter in prob:
    if ord(letter) >= 65 and ord(letter) <= 77:
        result += upper
    elif ord(letter) >= 78 and ord(letter) <= 91:
        result += lower
    else:
        pass

print(result)

# 변환 후 'X' = ' ' 진행
ans = "YOUXCANXREADXTHEXHIDDENXMESSAGEXSOXIXWILLXTELLXYOUXTHEXSOLUTIONXWHICHXISXTWELVEXRANDOMXLETTERSXGFFGONEHMMIM?"

print(ans.replace('X', ' '))