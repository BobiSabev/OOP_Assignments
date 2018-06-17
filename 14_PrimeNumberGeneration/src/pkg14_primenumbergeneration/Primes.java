package pkg14_primenumbergeneration;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import static pkg14_primenumbergeneration.Generator.genPrimes;

/**
 *
 * @author Austin s1016930
 */
public class Primes extends Thread {
    private final Lock lock;
    
    public Primes() {
        lock = new ReentrantLock();
    }
    public static void main(String[] args) {
        genPrimes();
    }
    
    @Override
    public void run() {
        lock.lock();
        try {
            Thread primeThread = new Thread((Runnable) new Generator(2));
            primeThread.start();  
        } catch (Exception e) {}
        finally {
            lock.unlock();
        }
    }
}

//First 100 Prime numbers.
//1: 2
//2: 3
//3: 5
//4: 7
//5: 11
//6: 13
//7: 17
//8: 19
//9: 23
//10: 29
//11: 31
//12: 37
//13: 41
//14: 43
//15: 47
//16: 53
//17: 59
//18: 61
//19: 67
//20: 71
//21: 73
//22: 79
//23: 83
//24: 89
//25: 97
//26: 101
//27: 103
//28: 107
//29: 109
//30: 113
//31: 127
//32: 131
//33: 137
//34: 139
//35: 149
//36: 151
//37: 157
//38: 163
//39: 167
//40: 173
//42: 181
//43: 191
//44: 193
//45: 197
//46: 199
//47: 211
//48: 223
//49: 227
//50: 229
//51: 233
//52: 239
//53: 241
//54: 251
//55: 257
//56: 263
//57: 269
//58: 271
//59: 277
//60: 281
//61: 283
//62: 293
//63: 307
//64: 311
//65: 313
//66: 317
//67: 331
//68: 337
//69: 347
//70: 349
//71: 353
//72: 359
//73: 367
//74: 373
//75: 379
//76: 383
//77: 389
//78: 397
//79: 401
//80: 409
//81: 419
//82: 421
//83: 431
//84: 433
//85: 439
//86: 443
//87: 449
//88: 457
//89: 461
//90: 463
//91: 467
//92: 479
//93: 487
//94: 491
//95: 499
//96: 503
//97: 509
//98: 521
//99: 523
//100: 541