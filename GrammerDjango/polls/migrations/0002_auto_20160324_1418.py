# -*- coding: utf-8 -*-
# Generated by Django 1.9.2 on 2016-03-24 14:18
from __future__ import unicode_literals

from django.db import migrations, models
import polls.models


class Migration(migrations.Migration):

    dependencies = [
        ('polls', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='exercisequestion',
            name='audio_url',
            field=models.FileField(blank=True, null=True, upload_to='audio resources', validators=[polls.models.validate_audio_extension]),
        ),
        migrations.AlterField(
            model_name='exercisequestion',
            name='question_type',
            field=models.CharField(choices=[('ty', 'Typing'), ('tf', 'True or False'), ('mc', 'Multiple Choice'), ('lc', 'Listening Comprehension')], default=('ty', 'Typing'), max_length=200),
        ),
    ]
