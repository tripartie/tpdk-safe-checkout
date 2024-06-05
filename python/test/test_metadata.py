# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.10
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.metadata import Metadata

class TestMetadata(unittest.TestCase):
    """Metadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Metadata:
        """Test Metadata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Metadata`
        """
        model = Metadata()
        if include_optional:
            return Metadata(
                id = 56,
                persona = 'https://example.com/',
                offer = 'https://example.com/',
                key = 'External-ID',
                value = '54412'
            )
        else:
            return Metadata(
        )
        """

    def testMetadata(self):
        """Test Metadata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
