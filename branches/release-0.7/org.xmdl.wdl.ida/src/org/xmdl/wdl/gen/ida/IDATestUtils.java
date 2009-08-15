package org.xmdl.wdl.gen.ida;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Enumeration;
import org.xmdl.wdl.EnumerationLiteral;
import org.xmdl.wdl.Type;
import org.xmdl.wdl.gen.utils.BasicType;
import org.xmdl.wdl.gen.utils.ExtensionUtils;
import org.xmdl.wdl.gen.utils.RandomUtils;
import org.xmdl.wdl.gen.utils.TestUtils;

public class IDATestUtils extends TestUtils {
	
	private Log logger = LogFactory.getLog(this.getClass());

	public static final IDATestUtils INSTANCE = new IDATestUtils();

	private RandomUtils utils = RandomUtils.INST;

	protected IDATestUtils() {
		super();
	}

	public Object randomValue(Attribute attrib, String variant) {
		Object preserved = getPreservedValue(attrib, variant);
		logger.debug("entity   :" + attrib.eContainer());
		logger.debug("attrib   :" + attrib);
		logger.debug("preserved:" + preserved);
		if (preserved != null)
			return preserved;

		Type type = attrib.getType();
		int length = IDAExtensionUtils.columnSize(attrib);
		Object result = null;
		
		BasicType basicType = ExtensionUtils.basicType(type);
		logger.debug("basicType:" + basicType);
		if (basicType != null)
		{
			switch (basicType) {
			case BOOLEAN:
				result = utils.randomBoolean();
				break;

			case DOUBLE:
			case FLOAT:
				result = utils.randomDouble(Math.pow(10, length));
				break;

			case INTEGER:
				result = utils.randomInt((int) Math.pow(10, length));
				break;

			case LONG:
				result = utils.randomLong();
				break;

			case STRING:
				result = utils.randomString(length);
				break;

			case DATE:
				// 347068800000L = 10 years in msecs
				result = utils.randomLong(347068800000L);
				break;

			default:
				break;
			}
		} else {
			if (type instanceof Enumeration) {
				Enumeration enumer = (Enumeration) type;
				List<EnumerationLiteral> literals = enumer.getLiterals();
				logger.debug("literals:" + literals);
				EnumerationLiteral literal = (EnumerationLiteral) utils
						.randomObject(literals);
				result = literal;
			}
		}
		logger.debug("result:" + result);

		if (result != null) {
			preserveValue(attrib, variant, result);
		}
		return result;
	}

}
