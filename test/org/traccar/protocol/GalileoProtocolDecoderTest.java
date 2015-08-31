package org.traccar.protocol;

import org.traccar.helper.TestIdentityManager;
import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class GalileoProtocolDecoderTest extends ProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());

        assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "011380033836383230343030313534393038370432008590"))));
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01cf030446ba10630320a7054c533008f86c8e0310062c043347049e02344000350940013241506b428f10432244aeea572045f9004604a0500000510000529a6b5300000446ba10712420ce1c4b533009b4f06703043df4033381037b0a343800350a40093241db6b428f10432544c05ef81f45f9004604a050000051000052886b5300000446ba10702420c11c4b53300a54f16703c450f403336e034e0a343900350840093241dd6b428f1043254491eaf71f45f9004604a050000051000052c26b5300000446ba106f2420b31c4b53300cecf267033865f403336a03300a343800350740093241e66b429010432544b446582045f9004604a050000051000052f76b5300000446ba106e2420a61c4b53300c9cf467038878f403337b03370a343800350740093241b56b428f10432544ba46f81f45f9004604a050000051000052c66b5300000446ba106d2420991c4b53300bc8f56703508cf403338d036e0a343700350840093241d66b428f10432544b4ea572045f9004604a050000051000052846b5300000446ba106c24208c1c4b533008c8f5670370a0f403338703920a343a00350e40093241c76b428f10432544c0fef71f45f9004604a0500000510000528d6b5300000446ba106b24207f1c4b533009a4f5670338b4f403337603920a343c00350a40093241d06b428f104325449146a81f45f9004604a0500000510000528a6b5300000446ba106a2420721c4b53300b9cf56703ecc7f403337103810a343a00350840093241ca6b428f10432544d12e582045f9004604a050000051000052996b5300000446ba10692420651c4b53300a64f6670358dbf403337a03490a343900350840093241e56b429010432544aed2f71f45f9004604a050000051000052b26b5300000446ba10682420581c4b5330094cf86703e0eef4033381030c0a343a00350940093241f96b428f10432544cb2e182145f9004604a050000051000052926b5300000446ba106724204b1c4b533009f8fa67032802f503337b03fc09343b00350a40093241d86b428f10432544c0ea772145f9004604a0500000510000529e6b5300000446ba106624203e1c4b533009a0fd67036815f503338403fd09343c00350a40093241a86b428f10432544ae2e582045f9004604a050000051000052a86b5300000446ba10652420311c4b53300944006803b028f503338003ff09343d00350940093241dc6b428e10432544a8fea71f45f9004604a050000051000052e26b5300000446ba10642420241c4b533008f0026803083cf503338b03f909343c00350d40093241d36b428f10432544c0eaa71f45f9004604a050000051000052ab6b530000ff3f"))));
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "011e8304320010270220dbd2f051300a90cf740328ac59033300000000347600351240012a41e92e42500f431f440006c814450f00460020500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d471020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f30000000004320010260220bdd2f051300590cf740328ac59033300000000347600351440090a41f02e427b0f431f44ff0db814450f00460000500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d471020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f300000000043200102502208ed2f051300ed8d0740304ac5903330000000034a500350a40012a41ec2e422d0f431f440016b814450f00460020500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d44d020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f300000000622e"))));

    }

}
